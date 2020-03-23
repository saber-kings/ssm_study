package com.qst.horizontal_extract;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_study
 * @Date: 2020/3/23
 * @Description: 描述信息
 * @Package: com.qst.horizontal_extract
 * @Version: 0.0.1
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验...");
        Object result = method.invoke(target, args);
        System.out.println("日志记录...");
        return result;
    }
}
