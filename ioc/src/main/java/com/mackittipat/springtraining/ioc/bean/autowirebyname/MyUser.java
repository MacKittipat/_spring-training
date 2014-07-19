package com.mackittipat.springtraining.ioc.bean.autowirebyname;

public class MyUser {

    private String name;

    public MyUser() {
        name = "Mac";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
