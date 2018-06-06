/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:22
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
import top.yimiaohome.model.Order;
import top.yimiaohome.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDao {
    @Autowired
    SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public List<Order> getOrdersByUser(User user){

        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            List<Order> orderList = new ArrayList<>();
            orderList = (List<Order>) session.createQuery("from Order where idUser = :idUser")
                    .setParameter("idUser",user.getIdUser())
                    .getResultList();
            transaction.commit();
            session.close();
            return orderList;
        }catch (HibernateException e){
            logger.error(e.getMessage());
            return null;
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }
    }

    public int save(Order order){
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            int result = (int) session.save(order);
            transaction.commit();
            session.close();
            return result;
        }catch (HibernateException e){
            return 0;
        }
    }
}
