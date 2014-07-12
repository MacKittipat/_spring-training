package com.mackittipat.springtraining.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingService {

    private final static Logger log = LoggerFactory.getLogger(LoggingService.class);

    public void saveLog() {
        log.debug("Saving log to Database");
    }
}
