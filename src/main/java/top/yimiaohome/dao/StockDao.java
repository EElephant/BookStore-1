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
import top.yimiaohome.model.Book;
import top.yimiaohome.model.Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class StockDao extends BaseDaoImpl<Stock,Integer>{

    //通过isbn查找库存信息
    public List<Stock> findStockByIsbn(String isbn) throws HibernateException,NullPointerException{

        String hql= "from Stock where isbn = :isbn";
        Map<String,Object> params = new HashMap<>();
        params.put("isbn",isbn);
        return findAll(hql,params);
    }

    //添加库存信息
    public int saveStock(Stock stock) throws HibernateException{
        return super.save(stock);
    }

    //通过id删除库存信息
    public boolean deleteStockById(int id){
        Stock stock = super.get(id);
        delete(stock);
        return true;
    }


    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
