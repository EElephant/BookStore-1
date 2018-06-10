/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 10:55
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

import java.util.List;

public class QueryBookDetailAction extends ActionSupport{
    @Autowired
    BookDao bookDao;
    private String isbn;
    Book book;
    public QueryBookDetailAction(){}

    public String execute() throws Exception{
        try {
            book = (Book) bookDao.findBookByIsbn(isbn);
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    public String getIsbn() {
        return isbn;
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
