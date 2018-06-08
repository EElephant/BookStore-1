/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:35
 * @version V1.0
 */
package top.yimiaohome.dao;

import top.yimiaohome.model.ShoppingCar;
import top.yimiaohome.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCarDao extends BaseDaoImpl<ShoppingCar,Integer> {

    public List<ShoppingCar> getShoppingCarsByUsername(String username){
        String hql = "from ShoppingCar sc,User u where sc.idUser = u.idUser and username = :username";
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        return findAll(hql,params);
    }
}
