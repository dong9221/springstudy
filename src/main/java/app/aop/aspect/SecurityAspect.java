package app.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/*
* 切面类
* */
@Aspect
@Component
public class SecurityAspect {

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

        System.out.println("我是切入点");
    }

    @Before("adminOnly()")
    public void check(){
        System.out.println("我是Before....");
    }

    @After("adminOnly()")
    public void send(){
        System.out.println("我是After....");
    }

    @After("adminOnly()")
    public void send2(){
        System.out.println("我是After2....");
    }
}
