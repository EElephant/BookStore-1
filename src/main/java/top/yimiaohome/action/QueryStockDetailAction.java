/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/13 10:31
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yimiaohome.dao.StockDao;
import top.yimiaohome.model.Stock;

import java.util.List;
import java.util.Map;

@Component
public class QueryStockDetailAction extends ActionSupport {
    @Autowired
    StockDao stockDao;
    Stock stock;
    List<Stock> stockList;
    private String isbn;
    public QueryStockDetailAction(){
        stock = new Stock();
    }

    @Override
    public String execute() throws Exception {
        try{
            stockList=stockDao.findStockByIsbn(isbn);
            stock=stockList.get(0);

            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return INPUT;
        }
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
