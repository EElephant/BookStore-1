/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/1 8:56
 * @version V1.0
 */
package top.yimiaohome.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.yimiaohome.model.Permissions;
import top.yimiaohome.model.Role;

import java.util.List;

@Repository
public class PermissionsDao {

    @Autowired
    SessionFactory sessionFactory;

    Logger logger = LogManager.getLogger(this.getClass().getName());

    public List<Permissions> getPermissions(Role role){

        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            List<Permissions> permissionList = session.createQuery(
                    "select p from Permissions p,RolePermissions i " +
                            "where p.idPermissions = i.idPermissions " +
                            "and i.idRole = :idRole")
                    .setParameter("idRole",role.getIdRole())
                    .list();
            transaction.commit();
            session.close();
            return permissionList;
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }
    }
}
