/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/13 10:24
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.StockDao;

public class DeleteStockAction extends ActionSupport {
    @Autowired
    StockDao stockDao;
    private int id;
    public DeleteStockAction(){}

    @Override
    public String execute() throws Exception {
        try{
            stockDao.deleteStockById(id);
            return SUCCESS;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return INPUT;
        }
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
