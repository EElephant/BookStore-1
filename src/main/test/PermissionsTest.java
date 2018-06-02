import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yimiaohome.dao.RoleDao;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.model.Role;
import top.yimiaohome.model.User;

import java.util.List;

/**
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/1 9:19
 * @version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/WEB-INF/applicationContextHibernate.xml"})
public class PermissionsTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    UserDao userDao;
    @Autowired
    RoleDao roleDao;

    @Test
    public void login() {

        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken("admin", "admin");
            token.setRememberMe(true);
            try {
                currentUser.login(token);
                session.setAttribute("loginUser", (User) currentUser.getPrincipal());

                currentUser.checkRole("test");
                currentUser.checkPermission("test");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testRole(){

        User u = userDao.findUserByName("test");
        System.out.println(u.getPassword());
        List<Role> l = roleDao.getRoles(u);
        for (Role r : l ){
            System.out.println(r.getRoleName());
        }

    }
}
