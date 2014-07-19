package com.mackittipat.springtraining.ioc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lazy {

    private final static Logger log = LoggerFactory.getLogger(Lazy.class);

    public Lazy() {
        log.debug("Lazy.java : I am so lazy");
    }
}
