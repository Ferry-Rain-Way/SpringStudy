import com.ghy.pojo.User;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
public class Junit5Test {

//    @Test
//    public  void testJunit5(){
//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user", User.class);
//        System.out.println(user);
//    }

        //@RunWith + @ContextConfiguration +     @Autowired注解
        @Autowired
        private User userZ;


        //注意此处引入的包是import org.junit.jupiter.api.Test;
        //是Junit5的包,不是import org.junit.Test;
        @Test
        public  void testJunit5(){
            System.out.println(userZ);
        }

}
