import com.nfjh.Resource.Spring6Config;
import com.nfjh.Resource.service.StudentService;
import com.nfjh.autowireTest.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationTest {
    @Test
    public void testNoXml(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = annotationConfigApplicationContext.getBean("studentService", StudentService.class);
        studentService.delStu();
    }

    @Test
    public void testResourceAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource-test.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.delStu();
    }

    @Test
    public void testAnnotationAutoWiredInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation-test.xml");
        Object userService = applicationContext.getBean("userService");
        UserService service = (UserService) userService;
        service.generate();
    }

    @Test
    public void testAnnotationValueInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation-test.xml");
        System.out.println(applicationContext.getBean("userAnnotation"));
    }



    @Test
    public void testFilter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("filter-test.xml");
////        Object stuDaoBean = applicationContext.getBean("stuDaoBean");
//        Object stuBean = applicationContext.getBean("stuBean");
//        Object stuServiceBean = applicationContext.getBean("stuServiceBean");
//        Object stuWebBean = applicationContext.getBean("stuWebBean");
//        Object userBean2 = applicationContext.getBean("user");
////        System.out.println(stuDaoBean);
////        System.out.println(stuBean);
//        System.out.println(stuServiceBean);
//        System.out.println(stuWebBean);
//        System.out.println(userBean2);
    }


    @Test
    public void testMuchPackage(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation-test.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
//com.nfjh.bean.User@16746061
//com.nfjh.bean2.Vip@57fd91c9
    }

    @Test
    public void testBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation-test.xml");
        Object stuDaoBean = applicationContext.getBean("stuDaoBean");
        Object stuBean = applicationContext.getBean("stuBean");
        Object stuServiceBean = applicationContext.getBean("stuServiceBean");
        Object stuWebBean = applicationContext.getBean("stuWebBean");
        Object userBean = applicationContext.getBean("userBean");
        Object userBean2 = applicationContext.getBean("user");
        System.out.println(stuDaoBean);
        System.out.println(stuBean);
        System.out.println(stuServiceBean);
        System.out.println(stuWebBean);
        System.out.println(userBean);
        System.out.println(userBean2);
        /*
        com.nfjh.bean.StuDao@29df4d43
        com.nfjh.bean.Student@5dd91bca
        com.nfjh.bean.StuService@40cb698e
        com.nfjh.bean.StuWeb@3382f8ae
        com.nfjh.bean.User@60641ec8
        * */
    }
}
