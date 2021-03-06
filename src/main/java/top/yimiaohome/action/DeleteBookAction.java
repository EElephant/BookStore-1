/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 2:05
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

public class DeleteBookAction extends ActionSupport {
    @Autowired
    BookDao bookDao;
    private int id;
    public DeleteBookAction(){}

    @Override
    public String execute() throws Exception {
        try {
            bookDao.deleteBookById(id);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
