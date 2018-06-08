/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/7 14:52
 * @version V1.0
 */
package top.yimiaohome.dao;


import org.springframework.stereotype.Repository;
import top.yimiaohome.model.UserDetail;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDetailDao extends BaseDaoImpl<UserDetail,Integer> {

    public UserDetail getUserDetailByUsername(String username) throws Exception{
        String hql = "select ud from UserDetail ud,User u where ud.idUser = u.idUser and username = :username";
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        return findAll(hql,params).get(0);
    }

}
