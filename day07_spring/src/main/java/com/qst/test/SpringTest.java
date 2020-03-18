package com.qst.test;

import com.qst.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.test
 * @version:1.0
 */
public class SpringTest {
    public static void main(String[] args) {
        //1.创建Spring的IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取Bean
        UserService userService = ac.getBean("userService", UserService.class);
        userService.findAll();
    }
}
