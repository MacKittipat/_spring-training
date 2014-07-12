package com.mackittipat.springtraining.logging;

import com.mackittipat.springtraining.logging.service.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private final static Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        log.debug("Hello world");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        LoggingService loggingService = (LoggingService) applicationContext.getBean("loggingService");
        loggingService.saveLog();
    }
}
