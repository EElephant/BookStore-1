/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 21:39
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
import top.yimiaohome.model.UserRole;


@Repository
@Transactional
public class UserRoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public int save(UserRole userRole){
        int result = 0;
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            result = (int) session.save(userRole);
            transaction.commit();
            session.close();
        }catch (HibernateException e){
            logger.error(e.getMessage());
            throw e;
        }
        return result;
    }
}
