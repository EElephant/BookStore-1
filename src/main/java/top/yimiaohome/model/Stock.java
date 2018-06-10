/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/5 20:17
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Component
@Entity
@Table
public class Stock {
    @GeneratedValue
    @Id
    private int id;
    @Column
    private String isbn;
    @Column
    private int number;
    @Column(nullable = true)
    private LocalDateTime  stockingTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getStockingTime() {
        return stockingTime;
    }

    public void setStockingTime(LocalDateTime stockingTime) {
        this.stockingTime = stockingTime;
    }
}
