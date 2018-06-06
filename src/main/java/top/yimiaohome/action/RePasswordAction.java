/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 22:17
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import top.yimiaohome.common.Md5Util;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.model.User;

@Component
public class RePasswordAction extends ActionSupport {

    @Autowired
    UserDao userDao;
    @Autowired
    Md5Util md5Util;


    User user;
    String oldPassword;
    String newPassword;
    String rePassword;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public String execute(){
        user = (User) ActionContext.getContext().getSession().get("loginUser");
        try {
//          public String getMd5(String credentials,String salt) throws CodecException,UnknownAlgorithmException
            newPassword = md5Util.getMd5(newPassword,user.getUsername());
            rePassword = md5Util.getMd5(rePassword,user.getUsername());
            user.setPassword(newPassword);
            userDao.save(user);
            User newUser = (User) ActionContext.getContext().getSession().get("loginUser");
            logger.info("Session user is new password is " + newUser.getPassword());
            return SUCCESS;
        }catch (HibernateException e){
            logger.error(e.getMessage());
            return ERROR;
        } catch (Exception e) {
            return ERROR;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
