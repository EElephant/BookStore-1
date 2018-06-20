/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/1 8:56
 * @version V1.0
 */
package top.yimiaohome.dao;


import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Permissions;
import top.yimiaohome.model.Role;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PermissionsDao extends BaseDaoImpl<Permissions,Integer> {

    public List<Permissions> getPermissionsByRoleName(String roleName){
        String hql = "select p from Permissions p,RolePermissions i,Role r where p.idPermissions = i.idPermissions and i.idRole = r.idRole and roleName = :roleName";
        Map<String,Object> params = new HashMap<>();
        params.put("roleName",roleName);
        return findAll(hql,params);
    }
}
