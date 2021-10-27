package D1013;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TransactionTest {
    public void xmlTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        accountDao.transfer("Jack","Rose",100.0);
        System.out.println("×ªÕË³É¹¦!");
    }
}
