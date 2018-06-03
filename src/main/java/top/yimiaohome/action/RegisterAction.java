/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 20:44
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yimiaohome.model.User;
import top.yimiaohome.service.RegisterService;

@Component
public class RegisterAction extends ActionSupport {

    @Autowired
    RegisterService registerService;

    @Autowired
    private User user;

    Logger logger = LogManager.getLogger(getClass().getName());

    private String username;
    private String password;
    private String email;
    private String phone;
    private String kaptchaValicode;

    public String execute(){
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);

        try{
            registerService.registerNewUser(user);
            return SUCCESS;
        }catch (Exception e){
            return ERROR;
        }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKaptchaValicode() {
        return kaptchaValicode;
    }

    public void setKaptchaValicode(String kaptchaValicode) {
        this.kaptchaValicode = kaptchaValicode;
    }
}
