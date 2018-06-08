/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:32
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Order;
import top.yimiaohome.model.OrderDeatil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class OrderDeatilDao extends BaseDaoImpl<OrderDeatil,Integer> {

    public List<OrderDeatil> getOrderDetailsByUser(Order order){
        String hql = "from OrderDetail where idOrder = :idOrder";
        Map<String,Object> params = new HashMap<>();
        params.put("idOrder",order.getIdOrder());
        return findAll(hql,params);
    }

    public int save(OrderDeatil orderDeatil){
        return super.save(orderDeatil);
    }
}
