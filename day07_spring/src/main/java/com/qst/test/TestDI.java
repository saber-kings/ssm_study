package com.qst.test;

import com.qst.di.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.test
 * @version:1.0
 */
public class TestDI {
    @Test
    public void testDI(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ac.getBean("car", Car.class);
        System.out.println(car);
    }
}
