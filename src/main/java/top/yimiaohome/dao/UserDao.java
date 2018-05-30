/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.dao;

import top.yimiaohome.entity.User;

public interface UserDao {

    public User findUserByName(String username);
}
