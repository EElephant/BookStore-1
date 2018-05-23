package top.yimiaohome.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.entity.User;

@Repository
public class UserImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findUserByName(String username) {
        return sessionFactory.getCurrentSession().get(User.class,username);
    }
}
