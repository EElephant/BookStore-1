/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:35
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
import top.yimiaohome.model.ShoppingCar;
import top.yimiaohome.model.User;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCarDao {

    @Autowired
    SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public List<ShoppingCar> getShoppingCarsByUser(User user){

        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            List<ShoppingCar> shoppingCarList = new ArrayList<>();
            shoppingCarList = (List<ShoppingCar>) session.createQuery("from ShoppingCar where idUser = :idUser")
                    .setParameter("idUser",user.getIdUser())
                    .getResultList();
            transaction.commit();
            session.close();
            return shoppingCarList;
        }catch (HibernateException e){
            logger.error(e.getMessage());
            return null;
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }
    }}
