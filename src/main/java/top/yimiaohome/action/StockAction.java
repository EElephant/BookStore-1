/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/9 17:15
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;

import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.StockDao;
import top.yimiaohome.model.Stock;
import java.util.List;

public class StockAction extends ActionSupport {
    @Autowired
    StockDao stockDao;
    private String isbn;
    private List<Stock> stockList;
    public StockAction(){}

    public String execute()throws Exception {
        try {
            stockList=stockDao.findStockByIsbn(isbn);
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }
}
