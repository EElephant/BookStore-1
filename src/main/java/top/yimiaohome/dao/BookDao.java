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

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class BookDao {

    @Autowired
    private SessionFactory sessionFactory;
    public BookDao(){}
    Logger logger = LogManager.getLogger(this.getClass().getName());
    //通过isbn查找书籍信息
    public List<Book> findBookByIsbn(String isbn){
        List<Book> books = new ArrayList<>();
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            books = (List<Book>) session.createQuery("from Book where isbn = :isbn").setParameter("isbn",isbn).list();
            transaction.commit();
            session.close();
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return books;
    }
    //添加书籍
    public boolean saveBook(Book book){
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            session.close();
            return true;
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return false;
        }
    }
    //通过isbn删除书籍信息
    public boolean deleteBookByIsbn(String isbn){
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            //根据isbn获取要修改的用户数据
            Book book=(Book)session.get(Book.class, isbn);
            //删除该book
            session.delete(book);
            transaction.commit();
            session.close();
            return true;
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return false;
        }
    }
    //通过isbn修改书籍信息
    public boolean updateBook(Book newbook){
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(newbook);
            transaction.commit();
            session.close();
            return true;
        }catch (HibernateException e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return false;
        }
    }
}
