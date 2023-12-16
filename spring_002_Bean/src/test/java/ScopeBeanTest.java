import com.nfjh.spring6.bean.ScopeBean;
import com.nfjh.spring6.factory.Con;
import com.nfjh.spring6.factory.Sweet;
import com.nfjh.spring6.factory.SweetFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;


public class ScopeBeanTest {

    @Test
    public void testDateFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
        Con conBean = applicationContext.getBean("conBean2", Con.class);
        System.out.println(conBean);
        //Condate=Thu Sep 20 00:00:00 CST 2001, clientLog='QQ_Log', clientType='QQ'}

    }

    @Test
    public   void testSweetFactoryImplBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
        Sweet sweetBean = applicationContext.getBean("sweetFactoryBeanImpl", Sweet.class);
        sweetBean.getType();
        //这是一个水果糖
    }


    @Test
    public   void testSweetFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
        Sweet sweetBean = applicationContext.getBean("sweetBean", Sweet.class);
        sweetBean.getType();
        //这是一个水果糖
    }


    @Test
    public void testSweetFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
        //spring通过sweetFactoryBean拿到sweetFactory类拿并返回的是Sweet对象
        Sweet sweet = applicationContext.getBean("sweetFactory", Sweet.class);
        sweet.getType();
        //这是一个水果糖
    }


    @Test
    public void testScopeBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        System.out.println("-------------");
        ScopeBean scopeBean = applicationContext.getBean("scopeBean", ScopeBean.class);
        System.out.println(scopeBean);
        ScopeBean scopeBean2 = applicationContext.getBean("scopeBean", ScopeBean.class);
        System.out.println(scopeBean2);
        ScopeBean scopeBean3 = applicationContext.getBean("scopeBean", ScopeBean.class);
        System.out.println(scopeBean3);
        /* 单例模式下:
                    无参构造执行了!
                    -------------
                    com.nfjh.spring6.bean.ScopeBean@75f95314
                    com.nfjh.spring6.bean.ScopeBean@75f95314
                    com.nfjh.spring6.bean.ScopeBean@75f95314
        * */

        /*
                    -------------
                    无参构造执行了!
                    com.nfjh.spring6.bean.ScopeBean@15dcfae7
                    无参构造执行了!
                    com.nfjh.spring6.bean.ScopeBean@3da05287
                    无参构造执行了!
                    com.nfjh.spring6.bean.ScopeBean@1e636ea3
         */
    }
}
