package app.aop.service;

import app.aop.aspect.AdminOnly;
import org.springframework.stereotype.Component;


@Component
public class TServiceImpl implements TService {


    @AdminOnly
    public String getName() {
        System.out.println("getName...");
        return "name";
    }

    @AdminOnly
    public void doSome() {

        System.out.println("doSome");
    }
}
