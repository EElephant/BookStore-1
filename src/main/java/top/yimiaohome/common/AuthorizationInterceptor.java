/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.common;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class AuthorizationInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map session = actionInvocation.getInvocationContext().getSession();
        String username = (String) session.get("account");
        if (username != null){
            return actionInvocation.invoke();
        }else {
            ActionContext actionContext = actionInvocation.getInvocationContext();
            actionContext.put("popedom","您还没有登陆，请登陆！");
            return "login";
        }
    }

}
