package com.mackittipat.springtraining.ioc.bean;

public class User {

    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
