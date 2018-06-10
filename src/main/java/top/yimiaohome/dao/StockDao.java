/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/9 17:16
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
import top.yimiaohome.model.Stock;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class StockDao {
    @Autowired
    private SessionFactory sessionFactory;
    Logger logger = LogManager.getLogger(this.getClass().getName());
    public StockDao(){}
    public List<Stock> findStockByIsbn(String isbn){
        List<Stock> stocks = new ArrayList<>();
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            stocks = (List<Stock>) session.createQuery("from Stock where isbn = :isbn").setParameter("isbn",isbn).list();
            transaction.commit();
            session.close();
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return stocks;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
