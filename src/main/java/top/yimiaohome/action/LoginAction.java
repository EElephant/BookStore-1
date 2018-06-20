/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import top.yimiaohome.common.Md5Util;
import top.yimiaohome.dao.UserDao;
@Component
public class LoginAction extends ActionSupport {

    UserDao userDao;
    Md5Util md5Util;
    Logger logger = LogManager.getLogger(this.getClass().getName());

    public LoginAction(UserDao userDao, Md5Util md5Util) {
        this.userDao = userDao;
        this.md5Util = md5Util;
    }

    private String username;
    private String password;

    public String login() throws Exception{
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if (!currentUser.isAuthenticated()){
            try {
//          public String getMd5(String credentials,String salt) throws CodecException,UnknownAlgorithmException
//                password = md5Util.getMd5(password, username);
                logger.info("username is :"+username +", password is :"+password);
                UsernamePasswordToken token = new UsernamePasswordToken(username,password);
                currentUser.login(token);
                logger.info(username + " 登录成功.");
                currentUser.checkRole("test");
                currentUser.checkPermission("test");
            } catch (UnknownAccountException uae) {
                logger.info("用户名不存在: " + uae);
                logger.error(uae.getMessage());
                return "input";
            } catch (IncorrectCredentialsException ice) {
                logger.info("用户名存在,但密码不匹配: " + ice);
                logger.error(ice.getMessage());
                return "input";
            } catch (LockedAccountException lae) {
                logger.info("用户被锁定: " + lae);
                logger.error(lae.getMessage());
                return "input";
            } catch (AuthenticationException ae) {
                logger.info("其他异常: " + ae);
                logger.error(ae.getMessage());
                return "input";
            }catch (Exception e){
                logger.error(e.getMessage());
                return ERROR;
            }
        }
// 退出登录，测试时用。正式版本删除该行代码
//        currentUser.logout();
//        logger.error("退出登录");
        return SUCCESS;
    }

    public String logout() throws Exception{
        try{
            SecurityUtils.getSubject().logout();
            logger.info("退出登录");
            return SUCCESS;
        }catch (Exception e){
            logger.error(e.getMessage());
            return ERROR;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }
}
