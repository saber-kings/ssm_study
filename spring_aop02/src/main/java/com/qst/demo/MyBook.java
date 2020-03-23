package com.qst.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_study
 * @Date: 2020/3/23
 * @Description: 描述信息
 * @Package: com.qst.demo
 * @Version: 0.0.1
 */
public class MyBook {
    public void before1(JoinPoint joinPoint){
        System.out.println("前置增强... ...");
    }

    public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("方法之前... ...");
        //执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("方法之前... ...");
    }

    //特点：获取目标方法的返回值
    public void afterReturning(JoinPoint joinPoint, Object returnObject){
        System.out.println("后置增强... ...");
    }
}
