/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/31 17:20
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Role;
import top.yimiaohome.model.User;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    @Transactional
    public List<Role> getRolesByUser(User user){
        List<Role> roleList = null;
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            roleList=session.createQuery(
                    "select r from Role r,UserRole i " +
                            "where r.idRole = i.idRole " +
                            "and i.idUser = :idUser")
                    .setParameter("idUser",user.getIdUser())
                    .getResultList();
            transaction.commit();
            session.close();
        }catch (HibernateException e){
            logger.error(e.getMessage());
            throw e;
        }
        return roleList;
    }

    public Role getRoleByRoleName(String roleName) throws HibernateException,NullPointerException{
        Role role;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        role = (Role) session.createQuery("from Role where roleName = :roleName")
                .setParameter("roleName",roleName)
                .getResultList().get(0);
        transaction.commit();
        session.close();
        return role;
    }

}
