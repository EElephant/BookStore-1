/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 10:55
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

import java.util.List;

public class QueryBookDetailAction extends ActionSupport{
    @Autowired
    BookDao bookDao;
    Book book;
    private String isbn;

    Logger logger = LogManager.getLogger(getClass().getName());

    public QueryBookDetailAction(){}

    public String execute() throws Exception{
        try {
            book = bookDao.findBookByIsbn(isbn).get(0);
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
