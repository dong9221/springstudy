
import app.aop.service.TService;
import app.ApplicationStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/*
* SpringBoot 单元测试
* SpringBoot+JUnit4 单元测试
* */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class TestAop {

    @Autowired
    TService tService;
    @Test
    public void test(){
        tService.doSome();
        tService.getName();
    }
}
