package com.qst.test;

import com.qst.definition.Bean01;
import com.qst.definition.Bean02;
import com.qst.definition.Bean03;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.test
 * @version:1.0
 */
public class TestDefinition {
    @Test
    public void testDefinition01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean01 bean01 = ac.getBean("bean01", Bean01.class);
        System.out.println(bean01);
    }

    @Test
    public void testDefinition02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean02 bean02 = ac.getBean("bean02", Bean02.class);
        System.out.println(bean02);
    }

    @Test
    public void testDefinition03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean03 bean03 = ac.getBean("bean03", Bean03.class);
        System.out.println(bean03);
    }

    @Test
    public void testDefinition04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean03 bean03_02 = ac.getBean("bean03_02", Bean03.class);
        System.out.println(bean03_02);
    }
}
