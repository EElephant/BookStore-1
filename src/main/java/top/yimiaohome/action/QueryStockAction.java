/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/13 10:27
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yimiaohome.dao.StockDao;
import top.yimiaohome.model.Stock;

import java.util.List;

@Component
public class QueryStockAction extends ActionSupport {
    @Autowired
    StockDao stockDao;
    List<Stock> stockList;
    private String isbn;
    public QueryStockAction(){}

    @Override
    public String execute() throws Exception {
        try{
            stockList=stockDao.findStockByIsbn(isbn);
            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
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

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
