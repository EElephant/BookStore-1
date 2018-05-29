package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
//
//@Controller("LoginAction")
//@Scope("prototype")
public class LoginAction extends ActionSupport {

    private String username;
    private String password;
    public String login() throws Exception{
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if (!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(true);
            try{
            currentUser.login(token);
            session.setAttribute("token",token.toString());
            } catch (UnknownAccountException uae) {
                System.out.println("用户名不存在: " + uae);
                return "input";
            } catch (IncorrectCredentialsException ice) {
                System.out.println("用户名存在,但密码和用户名不匹配: " + ice);
                return "input";
            } catch (LockedAccountException lae) {
                System.out.println("用户被锁定: " + lae);
                return "input";
            } catch (AuthenticationException ae) {
                System.out.println("其他异常: " + ae);
                return "input";
            }
        }
// 退出登录，测试时用。正式版本删除该行代码
        currentUser.logout();

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
