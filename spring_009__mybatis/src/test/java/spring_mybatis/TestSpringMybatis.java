package spring_mybatis;

import com.nfjh.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMybatis {

    @Test
    public void mybatisTest(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);

        try{
            accountServiceImpl.transferAccounts("A100","B100",100D);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
