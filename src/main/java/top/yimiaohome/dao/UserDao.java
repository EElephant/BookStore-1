/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
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
import org.springframework.transaction.annotation.Transactional;
import top.yimiaohome.model.User;


@Repository
@Transactional
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public User findUserByName(String username) {
        User user = null;
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            user = (User) session.createQuery("from User where username = :username").setParameter("username",username).list().get(0);
            transaction.commit();
            session.close();
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return user;
    }
}
