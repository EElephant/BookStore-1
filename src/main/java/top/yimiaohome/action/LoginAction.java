/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.model.User;


public class LoginAction extends ActionSupport {

    @Autowired
    UserDao userDao;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    private String username;
    private String password;
    public String login() throws Exception{
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if (!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            try{
                currentUser.login(token);
                ActionContext.getContext().getSession().put("loginUser",userDao.findUserByName(String.valueOf(currentUser.getPrincipal())));
                User user = (User) ActionContext.getContext().getSession().get("loginUser");

                currentUser.checkRole("test");
                currentUser.checkPermission("test");
            } catch (UnknownAccountException uae) {
                logger.info("用户名不存在: " + uae);
                return "input";
            } catch (IncorrectCredentialsException ice) {
                logger.info("用户名存在,但密码和用户名不匹配: " + ice);
                return "input";
            } catch (LockedAccountException lae) {
                logger.info("用户被锁定: " + lae);
                return "input";
            } catch (AuthenticationException ae) {
                logger.info("其他异常: " + ae);
                return "input";
            }
        }
// 退出登录，测试时用。正式版本删除该行代码
        currentUser.logout();
        logger.error("退出登录");

        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
