/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/3 21:39
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.springframework.stereotype.Repository;
import top.yimiaohome.model.UserRole;


@Repository
public class UserRoleDao extends BaseDaoImpl<UserRole,Integer> {

    public int save(UserRole userRole){
        return super.save(userRole);
    }
}
