/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 2:09
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

import java.util.List;

public class QueryBookAction extends ActionSupport {
    @Autowired
    BookDao bookDao;
    List<Book> bookList;
    private String isbn;
    public QueryBookAction(){}

    @Override
    public String execute() throws Exception {
        try {
            bookList=bookDao.findBookByIsbn(isbn);
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
