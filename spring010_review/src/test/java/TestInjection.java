import com.ts.bean.Container;
import com.ts.bean.Phone;
import com.ts.bean.Wifi;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {
//1、构造注入
    @Test
    public void constructTest(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleInjection/simpleInjection.xml");
        Wifi bean = applicationContext.getBean("wifiBean", Wifi.class);
        System.out.println(bean);
    }

    /*
    在IntelliJIDEA2021.3.3中的运行结果是：
    ----------------------
    Wifi{wifiName='Hello_Home', password='@Hello_123Home'}

    ----------------------
    总结：
        如果只有无参构造的话,执行结果:
            Wifi 无参构造调用
        对象的创建在 new ClassPathXmlApplicationContext("simpleInjection.xml"); 的过程中就被创建了
        以上结果为存在构造注入后的结果
    */

//2、set注入测试
    @Test
    public void setTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleInjection/simpleInjection.xml");
        Phone phoneBean = applicationContext.getBean("phoneBean", Phone.class);
        System.out.println(phoneBean);
        // Phone{phoneNumber='18655260920', phoneUser=User{userName='GuoHongYu', otherPhoneNumber=[张三, 李四, 王五]}}
    }


//3、外部bean就是直接使用ref,set注入时使用到

//4、内部bean的测试
    @Test
    public void internalBeanTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleInjection/simpleInjection.xml");
        Phone phoneBean2 = applicationContext.getBean("phoneBean2", Phone.class);
        System.out.println(phoneBean2);
        //Phone{phoneNumber='1008611', phoneUser=User{userName='GuoHongYu', otherPhoneNumber=[张三, 李四, 王五]}}Phone{phoneNumber='1008611', phoneUser=User{userName='GuoHongYu', otherPhoneNumber=[张三, 李四, 王五]}}
    }

//5、简单类型使用value进行赋值
//6、级联属性赋值

    @Test
    public void cascadeBeanTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleInjection/simpleInjection.xml");
        Phone phone = applicationContext.getBean("cascadePhone", Phone.class);
        System.out.println(phone);
        //Phone{phoneNumber='119', phoneUser=User{userName='guohongyu', otherPhoneNumber=[zhangsan, lisi, wangwu]}}
    }

//容器类型的注入
//array 、list 、set 、map 、properties
    @Test
    public void containerTest(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleInjection/container.xml");
        Container containerBean = applicationContext.getBean("containerBean", Container.class);
        System.out.println(containerBean);
    }
}
