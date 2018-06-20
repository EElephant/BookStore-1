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
import top.yimiaohome.dao.StockDao;
import top.yimiaohome.model.Stock;

import java.time.LocalDateTime;

@Component
public class UpdateStockAction extends ActionSupport {

    String isbn;
    Stock stock;

    @Autowired
    StockDao stockDao;

    @Override
    public String execute() {
        try{
            System.out.println(stock);
            stock.setStockingTime(LocalDateTime.now());
            stockDao.update(stock);
            System.out.println("success");
            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("failed");
            return INPUT;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
