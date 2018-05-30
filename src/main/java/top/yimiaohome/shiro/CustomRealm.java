package top.yimiaohome.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
import java.io.Serializable;

public class CustomRealm extends AuthorizingRealm implements Serializable {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;

        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());

        System.out.println("username : " + username + " ,password : " + password);

//        User user = userDao.findUserByName(username);
//
//        if (user == null)
//            throw new UnknownAccountException("账号不存在");
//        if (!user.getPassword().equals(password))
//            throw new IncorrectCredentialsException("密码错误");
        //模拟查询数据库进行登录操作
        if("a".equals(username)){
            throw new UnknownAccountException("没有这个账号");
        }
        if("a".equals(password)){
            throw new IncorrectCredentialsException("密码错误");
        }
        if("b".equals(username)){
            throw new LockedAccountException("账号被锁定!");
        }

        ShiroUser user = new ShiroUser();
        user.setUsername(username);

        return new SimpleAuthenticationInfo(username,password,getName());

    }
}
