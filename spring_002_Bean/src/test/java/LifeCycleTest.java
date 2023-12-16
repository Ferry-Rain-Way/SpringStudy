import com.nfjh.spring6.life_cycle.Student;
import com.nfjh.spring6.life_cycle.Student2;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DefaultLifecycleProcessor;

public class LifeCycleTest {
    @Test
    public void registerBean(){
        //让自己创建完毕的类纳入Spring容器的管理
        Student student = new Student();
        student.setAge(33);

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);

        Object studentBean = factory.getBean("studentBean");
        System.out.println(student);

    }


    @Test
    public  void testLifeCycle2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
        Student2 student2 = applicationContext.getBean("lifecycleBean2", Student2.class);
        student2.sleep();

        //销毁  [ApplicationContext没有close这个方法,需要向下转型]
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }


    @Test
    public  void testLifeCycle(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
        Student student = applicationContext.getBean("lifecycleBean", Student.class);
        student.sleep();

        //销毁  [ApplicationContext没有close这个方法,需要向下转型]
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
//        context.close();
    }
}
