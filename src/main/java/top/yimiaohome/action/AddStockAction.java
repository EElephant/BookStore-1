/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/13 10:17
 * @version V1.0
 */
package top.yimiaohome.action;

import com.mysql.cj.Session;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.StockDao;
import top.yimiaohome.model.Stock;

import java.time.LocalDateTime;

public class AddStockAction extends ActionSupport {
    @Autowired
    StockDao stockDao;
    Stock stock;
    private String isbn;
    private int number;
    public AddStockAction(){}

    @Override
    public String execute() throws Exception {
        try {
            Stock stock = new Stock();
            stock.setIsbn(isbn);
            stock.setNumber(number);
            System.out.println(stock.getIsbn());
            System.out.println(stock.getNumber());
            stockDao.saveStock(stock);
            System.out.println("success");
            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("failed");
            return INPUT;
        }
    }

    @Override
    public void validate() {
        if(isbn == null || isbn.equals("")){
            addFieldError("isbn","书籍编号不能为空！");
        }if(isbn.length()<1 || isbn.length()>15){
            addFieldError("isbn","书籍编号的范围在1~15之间！");
        }if("null".equals(String.valueOf(number)) || "0".equals(String.valueOf(number))){
            addFieldError("number","入库数量不能为空！");
        }if(String.valueOf(number).length()<1 || String.valueOf(number).length()>10000){
            addFieldError("number","入库数量的范围在1~10000之间！");
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
