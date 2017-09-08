
import app.aop.service.TService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
* Spring +JUnit4单元测试 @注解
* */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class TestSpringtest {

    /*
    * 传统方式加载context获取bean测试
    * */
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      //  TService tService = context.getBean(TService.class);
      //  tService.doSome();
    }

    @Autowired
    TService tService;

    @Test
    public void test(){
        tService.doSome();
    }

}
