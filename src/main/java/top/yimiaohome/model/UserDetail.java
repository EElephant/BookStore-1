/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:14
 * @version V1.0
 */
package top.yimiaohome.model;

import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import java.time.LocalDate;

@Repository
@Scope("prototype")
@Entity
@Table
public class UserDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int idUserDetail;
    @Column
    int idUser;
    @Column(nullable = true)
    String firstName;
    @Column(nullable = true)
    String lastName;
    @Column(nullable = true)
    String sex;
    @Column(nullable = true)
    LocalDate birthday;

    public int getIdUserDetail() {
        return idUserDetail;
    }

    public void setIdUserDetail(int idUserDetail) {
        this.idUserDetail = idUserDetail;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
