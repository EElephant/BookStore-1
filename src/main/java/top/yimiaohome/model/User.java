/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Component
@Scope("prototype")
@Entity
@Table
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column(nullable = true)
    private LocalDateTime createDate;
    @Column
    private String phone;
    @Column(nullable = true)
    private Integer defaultAddressId;

    public User() {
    }

    public User(String username, String password, String email, String phone) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.phone = phone;
        this.defaultAddressId = defaultAddressId;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDefaultAddressId() {
        return defaultAddressId;
    }

    public void setDefaultAddressId(int defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }
}
