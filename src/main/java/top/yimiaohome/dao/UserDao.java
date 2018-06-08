/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import top.yimiaohome.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao extends BaseDaoImpl<User,Integer> {

    public User findUserByUsername(String username) throws HibernateException,NullPointerException {
        String hql = "from User where username = :username";
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        return findAll(hql,params).get(0);
    }

    public int save(User user) throws HibernateException{
        int result = 0;
        result = super.save(user);
        return result;
    }
}
