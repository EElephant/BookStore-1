/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/31 17:20
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Role;
import top.yimiaohome.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RoleDao extends BaseDaoImpl<Role,Integer> {
    public List<Role> getRolesByUsername(String username) throws HibernateException,NullPointerException{
        String hql = "select r from Role r,UserRole i,User u where r.idRole = i.idRole and i.idUser = u.idUser and username = :username";
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        return findAll(hql,params);
    }

    public Role getRoleByRoleName(String roleName) throws HibernateException,NullPointerException{
        String hql = "from Role where roleName = :roleName";
        Map<String,Object> params = new HashMap<>();
        params.put("roleName",roleName);
        return findAll(hql,params).get(0);
    }

}
