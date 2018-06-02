/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/1 8:52
 * @version V1.0
 */
package top.yimiaohome.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Permissions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idPermissions;
    @Column
    private String permissionsName;
    @Column
    private LocalDateTime createTime;

    public int getIdPermissions() {
        return idPermissions;
    }

    public void setIdPermissions(int idPermissions) {
        this.idPermissions = idPermissions;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
