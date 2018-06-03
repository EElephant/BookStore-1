import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/2 23:04
 * @version V1.0
 */

public class Md5Test {

    @Test
    public void test(){

        String hashAlgorithmName = "MD5";
        String credentials = "test";
        String salt = "test";
        int hashIterations = 1;
        String str = String.valueOf(new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations));
        System.out.println(str);
    }
}
