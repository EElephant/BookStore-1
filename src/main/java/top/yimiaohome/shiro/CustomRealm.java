package top.yimiaohome.shiro;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.yimiaohome.dao.PermissionsDao;
import top.yimiaohome.dao.RoleDao;
import top.yimiaohome.dao.UserDao;
import top.yimiaohome.model.Permissions;
import top.yimiaohome.model.Role;
import top.yimiaohome.model.User;
/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class CustomRealm extends AuthorizingRealm implements Serializable {


    @Autowired
    UserDao userDao;
    @Autowired
    RoleDao roleDao;
    @Autowired
    PermissionsDao permissionsDao;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取登录时输入的用户名
        String username = (String) principals.getPrimaryPrincipal();
        User user = userDao.findUserByName(username);
        if (user != null) {
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //用户的角色集合
            Set<String> rolesNames = new HashSet<>();
            Set<String> permissionsNames = new HashSet<>();
            try {
                List<Role> roleList = roleDao.getRolesByUser(user);
                for (Role role : roleList) {
                    rolesNames.add(role.getRoleName());
                    logger.info("role :" + role.getRoleName());
                    List<Permissions> permissionsList = permissionsDao.getPermissions(role);
                    for (Permissions permissions : permissionsList) {
                        permissionsNames.add(permissions.getPermissionsName());
                    }
                }
            }catch (NullPointerException e){
                logger.error(e.getMessage());
            }
            info.setRoles(rolesNames);
            info.setStringPermissions(permissionsNames);
            return info;
        }
        return null;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        try {
            User user = userDao.findUserByName(usernamePasswordToken.getUsername());
            logger.info("db username : " + user.getUsername() + " ,password : " + user.getPassword());
            logger.info("token username : " + usernamePasswordToken.getUsername().toString() + " ,password : " + String.valueOf(usernamePasswordToken.getPassword()));
//        参数：
//            用户名
//            密码
//            加密盐（设置为用户名）
//            本类类名（无关参数）
            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), ByteSource.Util.bytes(user.getUsername()), this.getName());
        }catch (NullPointerException e){
            logger.error(e.getMessage());
            throw new UnknownAccountException("没有这个账号");
        }

    }

    public CustomRealm() {
        super();
    }
}
