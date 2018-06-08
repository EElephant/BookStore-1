import org.junit.Test;
import top.yimiaohome.model.UserDetail;

import java.time.LocalDate;

/**
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/8 13:46
 * @version V1.0
 */

public class SimpleTest {

    @Test
    public void test(){
        LocalDate date = LocalDate.parse("2018-06-04");
        UserDetail userDetail = new UserDetail();
        userDetail.setBirthday(date);
        System.out.println(userDetail.getBirthday());
        System.out.println(date.getYear());
        System.out.println(date.toString());
    }

}
