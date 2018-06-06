/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:17
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;


@Component
@Scope("prototype")
@Entity
@Table
public class Order {
    @GeneratedValue
    @Id
    int idOrder;
    @Column
    int idUser;
    @Column
    float totalPrice;
    @Column
    String postNum;
    @Column
    String postAdress;
    @Column(nullable = true)
    LocalDateTime createTime;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public String getPostAdress() {
        return postAdress;
    }

    public void setPostAdress(String postAdress) {
        this.postAdress = postAdress;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
