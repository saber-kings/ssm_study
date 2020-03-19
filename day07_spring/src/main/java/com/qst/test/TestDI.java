package com.qst.test;

import com.qst.di.Car;
import com.qst.di.Hero;
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
    public void testDI01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ac.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void testDI02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hero hero = ac.getBean("hero", Hero.class);
        System.out.println(hero);
    }
}
