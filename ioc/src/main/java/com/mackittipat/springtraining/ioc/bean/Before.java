package com.mackittipat.springtraining.ioc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Before {

    private final static Logger log = LoggerFactory.getLogger(Before.class);

    public Before() {
        log.debug("Before.java is initializing");
    }
}
