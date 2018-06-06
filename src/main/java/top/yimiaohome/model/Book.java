/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:51
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
public class Book {
//    书籍数量，用于创建订单时确认数量
    int numebr;

    @GeneratedValue
    @Id
    int id;
    @Column
    String skuid;
    @Column
    String isbn;
    @Column
    String title;
    @Column
    String author;
    @Column
    String publisher;
    @Column(name = "m_price")
    float marketPrice;
    @Column(name = "p_price")
    float presentPrice;
    @Column
    String type0;
    @Column(nullable = true)
    String type1l;
    @Column(nullable = true)
    String description;
    @Column(nullable = true)
    String language;
    @Column(nullable = true)
    String edition;
    @Column(name = "package",nullable = true)
    String bookPackage;
    @Column(nullable = true)
    String format;
    @Column(nullable = true)
    String publisherTime;
    @Column(nullable = true)
    String paper;
    @Column(nullable = true)
    String page;
    @Column(nullable = true)
    String words;
    @Column(nullable = true)
    String cpmmentCount;
    @Column(nullable = true)
    String contentDeatil;
    @Column(nullable = true)
    String imgs;

    public int getNumebr() {
        return numebr;
    }

    public void setNumebr(int numebr) {
        this.numebr = numebr;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public float getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(float presentPrice) {
        this.presentPrice = presentPrice;
    }

    public String getType0() {
        return type0;
    }

    public void setType0(String type0) {
        this.type0 = type0;
    }

    public String getType1l() {
        return type1l;
    }

    public void setType1l(String type1l) {
        this.type1l = type1l;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getBookPackage() {
        return bookPackage;
    }

    public void setBookPackage(String bookPackage) {
        this.bookPackage = bookPackage;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPublisherTime() {
        return publisherTime;
    }

    public void setPublisherTime(String publisherTime) {
        this.publisherTime = publisherTime;
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

    public String getCpmmentCount() {
        return cpmmentCount;
    }

    public void setCpmmentCount(String cpmmentCount) {
        this.cpmmentCount = cpmmentCount;
    }

    public String getContentDeatil() {
        return contentDeatil;
    }

    public void setContentDeatil(String contentDeatil) {
        this.contentDeatil = contentDeatil;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
}
