package com.mackittipat.springtraining.ioc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class After {

    private final static Logger log = LoggerFactory.getLogger(After.class);

    public After() {
        log.debug("After.java is initializing");
    }
}
