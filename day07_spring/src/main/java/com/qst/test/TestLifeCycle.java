package com.qst.test;

import com.qst.lifecycle.LifeCycle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.test
 * @version:1.0
 */
public class TestLifeCycle {
    @Test
    public void testCycle(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeCycle lifeCycle = cac.getBean("lifeCycle", LifeCycle.class);
        lifeCycle.printinfo();
        //调用close
        cac.close();
    }
}
