/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/4 20:15
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
import top.yimiaohome.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class BookDao extends BaseDaoImpl<Book,Integer> {

    //通过isbn查找书籍信息
    public List<Book> findBookByIsbn(String isbn) throws HibernateException,NullPointerException{

        String hql= "from Book where isbn = :isbn";
        Map<String,Object> params = new HashMap<>();
        params.put("isbn",isbn);
        return findAll(hql,params);
    }

    //添加书籍
    public int saveBook(Book book) throws HibernateException{
        return super.save(book);
    }

    //通过id删除书籍信息
    public boolean deleteBookById(int id){
        Book book = super.get(id);
        delete(book);
        return true;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
