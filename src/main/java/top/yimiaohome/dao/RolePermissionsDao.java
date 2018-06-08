/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 21:39
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.springframework.stereotype.Repository;
import top.yimiaohome.model.RolePermissions;

@Repository
public class RolePermissionsDao extends BaseDaoImpl<RolePermissions,Integer> {

    public int save(RolePermissions rolePermissions){
        return super.save(rolePermissions);
    }
}
