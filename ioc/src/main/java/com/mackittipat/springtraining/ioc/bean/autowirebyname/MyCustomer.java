package com.mackittipat.springtraining.ioc.bean.autowirebyname;

public class MyCustomer {

    private MyUser myUser;

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }
}

