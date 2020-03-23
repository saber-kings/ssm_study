package com.qst.vertical_extract;

//扩展功能
//添用户操作之后,添加日志功能
public class User extends BaseUser {
    //添加用户的方法
    public void add(){
        //添加逻辑
        System.out.println("添加用户... ...");
        //扩展功能 添用户操作之后,添加日志功能
        //调用父类的方法实现日志功能
        super.writeLog();
    }
}

