package com.qst.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
@Aspect
public class MyStudent {
    @Before("bean(*tudent)")
    public void before1(JoinPoint joinPoint) {
        System.out.println("学生学习Java基础，Java高级，数据库，Web基础，JSP... ...");
    }

    @AfterReturning(value = "bean(*tudent)", returning = "returnObject")
    public void after1(JoinPoint joinPoint, Object returnObject) {
        System.out.println("学生学习Hadoop，Hive，kafka，spark，Python，机器学习... ...");
    }
}
