/**
 * @Package top.yimiaohome.common
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/2 22:32
 * @version V1.0
 */
package top.yimiaohome.common;

import org.apache.shiro.codec.CodecException;
import org.apache.shiro.crypto.UnknownAlgorithmException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Repository;

@Repository
public class Md5Util {

    public String getMd5(String credentials,String salt) throws CodecException,UnknownAlgorithmException {
        String hashAlgorithmName = "MD5";
        int hashIterations = 1;
        String result = String.valueOf(new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations));
        return result;
    }
}
