/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/31 17:07
 * @version V1.0
 */
package top.yimiaohome.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Role {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idRole;
    @Column
    private String roleName;
    @Column
    private LocalDateTime createTime;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}