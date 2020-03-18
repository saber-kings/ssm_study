package com.qst.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.spring
 * @version:1.0
 */
public class UserTest {
    public static void main(String[] args) {
        //IOC：控制反转
        //1.创建Spring的IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取Bean
        User user = ac.getBean("user", User.class);
        user.setUserName("林青霞");
        user.hello();
    }
}
