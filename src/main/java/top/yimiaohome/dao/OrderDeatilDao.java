/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:32
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
import top.yimiaohome.model.OrderDeatil;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderDeatilDao {
    @Autowired
    SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public List<OrderDeatil> getOrderDetailsByUser(Order order){

        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            List<OrderDeatil> orderDeatilList = new ArrayList<>();
            orderDeatilList = (List<OrderDeatil>) session.createQuery("from OrderDetail where idOrder = :idOrder")
                    .setParameter("idOrder",order.getIdOrder())
                    .getResultList();
            transaction.commit();
            session.close();
            return orderDeatilList;
        }catch (HibernateException e){
            logger.error(e.getMessage());
            return null;
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }
    }

    public int save(OrderDeatil orderDeatil){
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            int result = (int) session.save(orderDeatil);
            transaction.commit();
            session.close();
            return result;
        }catch (HibernateException e){
            return 0;
        }
    }
}
