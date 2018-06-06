/**
 * @Package top.yimiaohome.action
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/4 10:22
 * @version V1.0
 */
package top.yimiaohome.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import top.yimiaohome.model.User;

public class LogoutAction extends ActionSupport {

    Logger logger = LogManager.getLogger(getClass().getName());

    public String execute(){
        try{
            SecurityUtils.getSubject().logout();
            return SUCCESS;
        }catch (Exception e){
            logger.error(e.getMessage());
            return ERROR;
        }
    }

}
