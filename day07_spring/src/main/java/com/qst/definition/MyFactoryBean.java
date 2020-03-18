package com.qst.definition;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.definition
 * @version:1.0
 */
public class MyFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new Bean03();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
