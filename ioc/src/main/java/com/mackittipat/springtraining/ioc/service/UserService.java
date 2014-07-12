package com.mackittipat.springtraining.ioc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    private final static Logger log = LoggerFactory.getLogger(UserService.class);

    public void save() {
        log.debug("Saving user");
    }

    public void delete() {
        log.debug("Deleting user");
    }
}
