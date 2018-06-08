/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/8 11:01
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.UserDetailDao;
import top.yimiaohome.model.UserDetail;
import java.time.LocalDate;

public class UserDetailUpdateAction extends ActionSupport {

    UserDetailDao userDetailDao;

    int idUserDetail;
    int idUser;
    String firstName;
    String lastName;
    String sex;
    String birthday;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public UserDetailUpdateAction(UserDetailDao userDetailDao) {
        this.userDetailDao = userDetailDao;
    }

    public String update() throws Exception {
        UserDetail temp = new UserDetail();
        temp.setIdUserDetail(idUserDetail);
        temp.setIdUser(idUser);
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        temp.setSex(""+sex);
//        if (null != birthday && !birthday.endsWith(""))
        temp.setBirthday(LocalDate.parse(birthday));
        logger.info("birthday is :" + temp.getBirthday().toString());
        userDetailDao.saveOrUpdate(temp);
        ActionContext.getContext().put("userDetail",temp);
        return SUCCESS;
    }

    public int getIdUserDetail() {
        return idUserDetail;
    }

    public void setIdUserDetail(int idUserDetail) {
        this.idUserDetail = idUserDetail;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
