import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yimiaohome.common.Md5Util;

/**
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/2 23:04
 * @version V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/WEB-INF/applicationContextHibernate.xml","/WEB-INF/applicationContextShiro.xml"})
public class Md5Test extends AbstractJUnit4SpringContextTests {

    @Autowired
    Md5Util md5Util;

    @Test
    public void test(){

        String hashAlgorithmName = "MD5";
        String credentials = "admin";
        String salt = "admin";
        int hashIterations = 1;
        String str = md5Util.getMd5(credentials,salt);
        System.out.println(str);
    }
}
