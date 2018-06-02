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
    public List<Role> getRoles(User user){
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
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return roleList;

    }

}
