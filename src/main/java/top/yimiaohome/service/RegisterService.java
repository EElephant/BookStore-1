/**
 * @Package top.yimiaohome.service
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 21:48
 * @version V1.0
 */
package top.yimiaohome.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yimiaohome.dao.RoleDao;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.dao.UserRoleDao;
import top.yimiaohome.model.Role;
import top.yimiaohome.model.User;
import top.yimiaohome.model.UserRole;

@Service
public class RegisterService {

    @Autowired
    UserDao userDao;
    @Autowired
    RoleDao roleDao;
    @Autowired
    UserRoleDao userRoleDao;
    @Autowired
    UserRole userRole;

    Logger logger = LogManager.getLogger(getClass().getName());

    public void registerNewUser(User user){

        try {
            int result = userDao.save(user);
            user.setIdUser(result);
            logger.info("The register user's idUser is " + result);
            Role role = roleDao.getRoleByRoleName("user");
            userRole.setIdRole(role.getIdRole());
            userRole.setIdUser(user.getIdUser());
            userRoleDao.save(userRole);
        }catch (HibernateException e){
            logger.error(e.getMessage());
        }catch (NullPointerException e){
            logger.error("Could't found role by roleName : user");
            logger.error(e.getMessage());
        }


    }
}
