package com.qst.test;

import com.qst.scope.PrototypeBean;
import com.qst.scope.SingletonBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.test
 * @version:1.0
 */
public class TestScope {
    @Test
    public void testSingleton() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        SingletonBean singletonBean01 = ac.getBean("singletonBean", SingletonBean.class);
        SingletonBean singletonBean02 = ac.getBean("singletonBean", SingletonBean.class);

        System.out.println(singletonBean01);
        System.out.println(singletonBean02);
        System.out.println("====================================");
        System.out.println(singletonBean01 == singletonBean02);
    }

    @Test
    public void testPrototypeBean() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        PrototypeBean prototypeBean01 = ac.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean02 = ac.getBean("prototypeBean", PrototypeBean.class);

        System.out.println(prototypeBean01);
        System.out.println(prototypeBean02);
        System.out.println("====================================");
        System.out.println(prototypeBean01 == prototypeBean02);
    }
}
