import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yimiaohome.aop.LogInterceptor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/WEB-INF/applicationContextHibernate.xml","/WEB-INF/applicationContextShiro.xml"})
public class Log4jTest extends AbstractJUnit4SpringContextTests {


    Logger logger = LogManager.getLogger(this.getClass().getName());

    @Test
    public void log4jTest(){
        System.out.println("start");
        logger.trace("tract level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
