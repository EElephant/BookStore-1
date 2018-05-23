package top.yimiaohome.dao;

import top.yimiaohome.entity.User;

public interface UserDao {

    public User findUserByName(String username);
}
