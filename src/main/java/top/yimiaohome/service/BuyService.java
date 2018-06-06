/**
 * @Package top.yimiaohome.service
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/6 14:47
 * @version V1.0
 */
package top.yimiaohome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yimiaohome.dao.OrderDao;
import top.yimiaohome.dao.OrderDeatilDao;
import top.yimiaohome.model.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuyService {

    @Autowired
    OrderDao orderDao;
    @Autowired
    OrderDeatilDao orderDeatilDao;

    public void buyBooks(User user, List<Book> bookList, UserAddress userAddress){
        int totalMarketPrice = 0;
        int totalPresentPrice = 0;
        Order order = new Order();
        List<OrderDeatil> orderDeatilList = new ArrayList<>();
        for(Book book:bookList){
//            查询库存
            totalMarketPrice += book.getMarketPrice();
            totalPresentPrice += book.getPresentPrice();
        }
        order.setIdUser(user.getIdUser());
        order.setPostAdress("userAddress.getIdUserAddress()");
        order.setPostNum("随机数生成postnum");
        order.setTotalPrice(totalPresentPrice);
        try {
            int idOrder = orderDao.save(order);
            order.setIdOrder(idOrder);
            for(Book book:bookList){
                OrderDeatil orderDeatil = new OrderDeatil();
                orderDeatil.setIdOrder(order.getIdOrder());
                orderDeatil.setIsbn(book.getIsbn());
                orderDeatil.setNumber(book.getNumebr());
                orderDeatilDao.save(orderDeatil);
            }
        }catch (Exception e){
            throw e;
        }
    }
}
