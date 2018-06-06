/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:19
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Component
@Scope("prototype")
@Entity
@Table
public class OrderDeatil {

    @GeneratedValue
    @Id
    int id;
    @Column
    int idOrder;
    @Column
    String isbn;
    @Column
    int number;
    @Column(nullable = true)
    int discount;

    public void setId(int id) {
        this.id = id;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
