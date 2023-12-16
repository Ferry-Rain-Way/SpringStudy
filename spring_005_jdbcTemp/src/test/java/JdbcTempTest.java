import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class JdbcTempTest {

    JdbcTemplate jdbcTemplate;
    @Before
    public void testDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcTemp.xml");
        jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

    }

    @Test
    public void testJdbcTemplateInsert(){
        String sql = "insert into t_user(real_name,age) values(?,?)";
        int count = jdbcTemplate.update(sql,"张三", 23);
        System.out.println(count);
    }

    @Test
    public void testJdbcTemplateDelete(){
        String sql = "delete from t_user where id = ?";
        int update = jdbcTemplate.update(sql, 9);
        System.out.println(update);
    }

    @Test
    public void testJdbcTemplateUpdate(){
        String sql = "update t_user set real_name = ? where id = ?";
        jdbcTemplate.update(sql,"法外狂徒",10);
    }

    @Test
    public void testJdbcTemplateSelect(){
        String sql = "select * from t_user";
//        jdbcTemplate.query(sql,);
    }
}
