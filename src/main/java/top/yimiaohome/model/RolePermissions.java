/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/1 8:52
 * @version V1.0
 */
package top.yimiaohome.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
@Table
public class RolePermissions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private int idRole;
    @Column
    private int idPermissions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public int getIdPermissions() {
        return idPermissions;
    }

    public void setIdPermissions(int idPermissions) {
        this.idPermissions = idPermissions;
    }
}
