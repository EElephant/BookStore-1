/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/7 21:58
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.dao.UserDetailDao;
import top.yimiaohome.model.User;
import top.yimiaohome.model.UserDetail;

@Component
public class UserDetailAction extends ActionSupport {

    UserDetail userDetail;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    UserDao userDao;
    UserDetailDao userDetailDao;

    public UserDetailAction(UserDao userdao, UserDetailDao userDetailDao) {
        this.userDao = userdao;
        this.userDetailDao = userDetailDao;
    }

    public String init() throws Exception{
//        String username = SecurityUtils.getSubject().getPrincipal().toString();
        String username = "admin";
        try {
            userDetail = userDetailDao.getUserDetailByUsername(username);
        }catch (IndexOutOfBoundsException e){
            if (null == userDetail){
                userDetail = new UserDetail();
            }else if (userDetail.getIdUser() == 0){
                try {
                    User user = userDao.findUserByUsername(username);
                    userDetail.setIdUser(user.getIdUser());
                    userDetail.setFirstName("");
                    userDetail.setLastName("");
                    userDetail.setSex("");
                }catch (Exception ex){
                    logger.error(ex.getMessage());
                }
            }
        }
        ActionContext.getContext().put("userDetail",userDetail);
        return SUCCESS;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

}
