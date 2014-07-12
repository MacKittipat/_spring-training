package com.mackittipat.springtraining.ioc;

import com.mackittipat.springtraining.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
        userService.delete();
    }
}
