package com.qst.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_study
 * @Date: 2020/3/23
 * @Description: 描述信息
 * @Package: com.qst.annotation
 * @Version: 0.0.1
 */
public class StudentTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotationContext.xml");
        Student student = ac.getBean("student", Student.class);
        student.study();
    }
}
