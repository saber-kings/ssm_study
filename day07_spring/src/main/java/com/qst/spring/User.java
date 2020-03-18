package com.qst.spring;
public class User {
    private String userName;
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void hello() {
        System.out.println("Hello: "+userName+"!");
    }
}
