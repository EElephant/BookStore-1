/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 2:09
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

public class QueryBookAction extends ActionSupport {
    @Autowired
    BookDao bookDao;
    List<Book> bookList;
    private String isbn;
    public QueryBookAction(){}

    Logger logger = LogManager.getLogger(getClass().getName());

    @Override
    public String execute() throws Exception {
        try {
            bookList=bookDao.findBookByIsbn(isbn);
            logger.info(bookList.get(0).getTitle());
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    @Override
    public void validate() {
        if (isbn == null || isbn.equals("")) {
            addFieldError("isbn", "书籍编号不能为空！");
        }
        if (isbn.length() < 1 || isbn.length() > 15) {
            addFieldError("isbn", "书籍编号的范围在1~15之间！");
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

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
