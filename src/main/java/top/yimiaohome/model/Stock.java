/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/5 20:17
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table
public class Stock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private String isbn;
    @Column
    private int number;
    @Column(nullable = true,insertable = false)
    private LocalDateTime  stockingTime;
    @Transient
    private String dateTime;

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
    public void setDateTime(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.stockingTime = LocalDateTime.parse(dateTime,formatter);
    }

    public String getDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return stockingTime.format(formatter);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", number=" + number +
                ", stockingTime=" + stockingTime +
                '}';
    }
}
