/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/4 17:01
 * @version V1.0
 */
package top.yimiaohome.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
@Component
@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String isbn;
    @Column
    private int id;
    @Column
    private String skuid;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String publisher;
    @Column
    private BigDecimal m_price;
    @Column
    private BigDecimal p_price;
    @Column
    private String type0;
    @Column
    private String type1;
    @Column
    private String descrtion;
    @Column
    private String language;
    @Column(nullable = true)
    private String edition;
    /*@Column
    private String XXXXXXXXXXXXX;//关键字，待改正*/
    @Column(nullable = true)
    private String format;
    @Column(nullable = true)
    private String publisher_time;
    @Column(nullable = true)
    private String paper;
    @Column(nullable = true)
    private String page;
    @Column(nullable = true)
    private String words;
    @Column(nullable = true)
    private String comment_counts;
    @Column(nullable = true)
    private String content_detail;
    @Column(nullable = true)
    private String imgs;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getM_price() {
        return m_price;
    }

    public void setM_price(BigDecimal m_price) {
        this.m_price = m_price;
    }

    public BigDecimal getP_price() {
        return p_price;
    }

    public void setP_price(BigDecimal p_price) {
        this.p_price = p_price;
    }

    public String getType0() {
        return type0;
    }

    public void setType0(String type0) {
        this.type0 = type0;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getDescrtion() {
        return descrtion;
    }

    public void setDescrtion(String descrtion) {
        this.descrtion = descrtion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /*public String getXXXXXXXXXXXXX() {
        return XXXXXXXXXXXXX;
    }

    public void setXXXXXXXXXXXXX(String XXXXXXXXXXXXX) {
        this.XXXXXXXXXXXXX = XXXXXXXXXXXXX;
    }*/

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPublisher_time() {
        return publisher_time;
    }

    public void setPublisher_time(String publisher_time) {
        this.publisher_time = publisher_time;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getComment_counts() {
        return comment_counts;
    }

    public void setComment_counts(String comment_counts) {
        this.comment_counts = comment_counts;
    }

    public String getContent_detail() {
        return content_detail;
    }

    public void setContent_detail(String content_detail) {
        this.content_detail = content_detail;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
}
