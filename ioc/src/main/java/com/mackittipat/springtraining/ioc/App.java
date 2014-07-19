package com.mackittipat.springtraining.ioc;

import com.mackittipat.springtraining.ioc.bean.Lazy;
import com.mackittipat.springtraining.ioc.bean.People;
import com.mackittipat.springtraining.ioc.bean.User;
import com.mackittipat.springtraining.ioc.bean.autowirebyname.MyCustomer;
import com.mackittipat.springtraining.ioc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private final static Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
        userService.delete();

        User user = (User) applicationContext.getBean("user");
        log.debug("User (address = {})", user.getAddress().getProvince());

        People people = (People) applicationContext.getBean("people");
        log.debug("People (address = {})", people.getAddress().getProvince());

        log.debug("Initializing Lazy.java");
        Lazy lazy = (Lazy) applicationContext.getBean("lazy");

        MyCustomer myCustomer = (MyCustomer) applicationContext.getBean("myCustomer");
        log.debug("User name = {}", myCustomer.getMyUser().getName());
    }
}
