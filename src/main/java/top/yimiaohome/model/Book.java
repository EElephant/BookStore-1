/**
 * @Package top.yimiaohome.model
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:51
 * @version V1.0
 */
package top.yimiaohome.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    float m_price;
    @Column(name = "p_price")
    float p_price;
    @Column
    String type0;
    @Column(nullable = true)
    String type1;
    @Column(nullable = true)
    String descrtion;
    @Column(nullable = true)
    String language;
    @Column(nullable = true)
    String edition;
    @Column(name = "package",nullable = true)
    String bookPackage;
    @Column(nullable = true)
    String format;
    @Column(nullable = true)
    String publisher_time;
    @Column(nullable = true)
    String paper;
    @Column(nullable = true)
    String page;
    @Column(nullable = true)
    String words;
    @Column(nullable = true)
    String comment_counts;
    @Column(nullable = true)
    String content_detail;
    @Column(nullable = true)
    String imgs;


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

    public float getM_price() {
        return m_price;
    }

    public void setM_price(float m_price) {
        this.m_price = m_price;
    }

    public float getP_price() {
        return p_price;
    }

    public void setP_price(float p_price) {
        this.p_price = p_price;
    }

    public String getDescrtion() {
        return descrtion;
    }

    public void setDescrtion(String descrtion) {
        this.descrtion = descrtion;
    }

    public String getPublisher_time() {
        return publisher_time;
    }

    public void setPublisher_time(String publisher_time) {
        this.publisher_time = publisher_time;
    }

    public String getComment_counts() {
        return comment_counts;
    }

    public void setComment_counts(String comment_counts) {
        this.comment_counts = comment_counts;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", skuid='" + skuid + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", m_price=" + m_price +
                ", p_price=" + p_price +
                ", type0='" + type0 + '\'' +
                ", type1='" + type1 + '\'' +
                ", descrtion='" + descrtion + '\'' +
                ", language='" + language + '\'' +
                ", edition='" + edition + '\'' +
                ", bookPackage='" + bookPackage + '\'' +
                ", format='" + format + '\'' +
                ", publisher_time='" + publisher_time + '\'' +
                ", paper='" + paper + '\'' +
                ", page='" + page + '\'' +
                ", words='" + words + '\'' +
                ", comment_counts='" + comment_counts + '\'' +
                ", content_detail='" + content_detail + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
