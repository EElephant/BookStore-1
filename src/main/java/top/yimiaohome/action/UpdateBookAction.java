/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 2:14
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

@Component
public class UpdateBookAction extends ActionSupport {
    private String isbn;

    Book book;
    @Autowired
    BookDao bookDao;

    public UpdateBookAction() {
        this.book = new Book();
    }

    @Override
    public String execute() throws Exception {
        try{
            System.out.println(book);
            bookDao.update(book);
            System.out.println("success");
            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("failed");
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
