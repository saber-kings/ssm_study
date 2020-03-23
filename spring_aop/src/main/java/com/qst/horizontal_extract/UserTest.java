package com.qst.horizontal_extract;

import java.lang.reflect.Proxy;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_study
 * @Date: 2020/3/23
 * @Description: 描述信息
 * @Package: com.qst.horizontal_extract
 * @Version: 0.0.1
 */
public class UserTest {
    public static void main(String[] args) {
        UserDao userDao1 = new UserDaoImpl();
        userDao1.add();
        userDao1.delete();
        userDao1.update();
        userDao1.find();

//        UserDao userDao2 = new UserDaoImplExt();
//        userDao2.add();
//        userDao2.delete();
//        userDao2.update();
//        userDao2.find();
        //我们要创建一个动态代理对象
        //Proxy类中有一个方法可以创建动态代理对象
        //public static Object newProxyInstance(ClassLoader loader,
        //                  Class<?>[] interfaces,InvocationHandler h)
        //                              throws IllegalArgumentException
        //我准备对ud对象做一个代理对象

        MyInvocationHandler handler = new MyInvocationHandler(userDao1);
        UserDao proxyInstance = (UserDao)Proxy.newProxyInstance(
                userDao1.getClass().getClassLoader(),
                userDao1.getClass().getInterfaces(),
                handler);
        proxyInstance.add();
        proxyInstance.delete();
        proxyInstance.update();
        proxyInstance.find();
    }
}
