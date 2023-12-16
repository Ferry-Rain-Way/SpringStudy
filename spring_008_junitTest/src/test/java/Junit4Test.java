import com.ghy.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Junit4Test {

//    @Test
//    public  void testJunit4(){
//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user", User.class);
//        System.out.println(user);
//    }



    //@RunWith + @ContextConfiguration +     @Autowired注解

    @Autowired
    private User user;

    @Test
    public  void testJunit4(){
        System.out.println(user);
    }



}
