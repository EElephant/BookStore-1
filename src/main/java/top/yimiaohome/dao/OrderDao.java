/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:22
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Order;
import top.yimiaohome.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderDao extends BaseDaoImpl<Order,Integer> {

    public List<Order> getOrdersByUsername(User user){
        String hql = "from Order where idUser = :idUser";
        Map<String,Object> params = new HashMap<>();
        params.put("idUser",user.getIdUser());
        return findAll(hql,params);
    }

    public int save(Order order){
        return super.save(order);
    }

}
