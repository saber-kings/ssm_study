package com.qst.lifecycle.impl;

import com.qst.lifecycle.LifeCycle;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.lifecycle.impl
 * @version:1.0
 */
public class LifeCycleImpl implements LifeCycle {
    public LifeCycleImpl() {
        System.out.println("我出生了，哈哈哈...");
    }

    @Override
    public void init() {
        System.out.println("剪脐带... ....");
    }

    @Override
    public void printinfo() {
        System.out.println("Hello!Spring!...");
    }

    @Override
    public void destory() {
        System.out.println("留遗言... ....");
    }
}
