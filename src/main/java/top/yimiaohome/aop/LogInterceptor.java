/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/5/29 20:33
 * @version V1.0
 */
package top.yimiaohome.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@ComponentScan
@EnableAspectJAutoProxy
public class LogInterceptor {

    Logger logger = LogManager.getLogger(this.getClass().getName());

    @Pointcut("execution(* top.yimiaohome..*.*(..))")
    public void recordLog(){}

    @Before("recordLog()")
    public void before(JoinPoint point){
        logger.debug(point.getSignature().getDeclaringType().getName() + " - " + point.getSignature().getName() + "() start.");
    }

    @After("recordLog()")
    public void after(JoinPoint point){
        logger.debug(point.getSignature().getDeclaringType().getName() + " - " + point.getSignature().getName()  + "() stop.");
    }

}
