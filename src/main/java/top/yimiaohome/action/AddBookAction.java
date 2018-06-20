/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author 一贱你就笑
 * @date 2018/6/10 1:58
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import top.yimiaohome.dao.BookDao;
import top.yimiaohome.model.Book;

public class AddBookAction extends ActionSupport {
    @Autowired
    BookDao bookDao;
    Book book;
    private String skuid;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private float m_price;
    private float p_price;
    private String type0;
    public AddBookAction(){}

    Logger logger = LogManager.getLogger(getClass().getName());


    public String execute() throws Exception {
        try{
            System.out.println("BeginSave");
            Book book = new Book();
            book.setSkuid(skuid);
            book.setIsbn(isbn);
            book.setTitle(title);
            book.setAuthor(author);
            book.setPublisher(publisher);
            book.setM_price(m_price);
            book.setP_price(p_price);
            book.setType0(type0);
            bookDao.saveBook(book);
            System.out.println("SaveSuccess");
            return SUCCESS;
        }catch (Exception e){
            return INPUT;
        }
    }

    @Override
    public void validate() {
        if(skuid == null || skuid.equals("")){
            addFieldError("skuid","商品编号不能为空！");
        }if(skuid.length()<1 || skuid.length()>15){
            addFieldError("skuid","商品编号的范围在1~15之间！");
        }if(isbn == null || isbn.equals("")){
            addFieldError("isbn","书籍编号不能为空！");
        }if(isbn.length()<1 || isbn.length()>15){
            addFieldError("isbn","书籍编号的范围在1~15之间！");
        }if(title == null || title.equals("")){
            addFieldError("title","书名不能为空！");
        }if(title.length()<1 || title.length()>15){
            addFieldError("title","书名的范围在1~15之间！");
        }if(author == null || author.equals("")){
            addFieldError("author","作者不能为空！");
        }if(author.length()<1 || author.length()>15){
            addFieldError("author","作者的范围在1~15之间！");
        }if(publisher == null || publisher.equals("")){
            addFieldError("publisher","出版社不能为空！");
        }if(publisher.length()<1 || publisher.length()>15){
            addFieldError("publisher","出版社的范围在1~15之间！");
        }if( "null".equals(String.valueOf(m_price)) || "0".equals(String.valueOf(m_price))){
            addFieldError("m_price","发行价格不能为空！");
        }if(String.valueOf(m_price).length()<1 || String.valueOf(m_price).length()>1000){
            addFieldError("m_price","发行价格的范围在1~1000之间！");
        }if("null".equals(String.valueOf(p_price)) || "0".equals(String.valueOf(p_price))){
            addFieldError("p_price","出售价格不能为空！");
        }if(String.valueOf(p_price).length()<1 || String.valueOf(p_price).length()>1000){
            addFieldError("p_price","出售价格的范围在1~1000之间！");
        }if(type0 == null || type0.equals("")){
            addFieldError("type0","书籍类别不能为空！");
        }if(type0.length()<1 || type0.length()>15){
            addFieldError("type0","书籍书籍的范围在1~15之间！");
        }
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public String getType0() {
        return type0;
    }

    public void setType0(String type0) {
        this.type0 = type0;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
