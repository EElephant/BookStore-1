/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 1:58
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

public class AddBookAction extends ActionSupport {
    @Autowired
    BookDao bookDao;
    Book book;
    public AddBookAction(){}

    @Override
    public String execute() throws Exception {
        try{
            bookDao.saveBook(book);
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
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
