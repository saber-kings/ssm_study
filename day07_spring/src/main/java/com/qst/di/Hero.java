package com.qst.di;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/19
 * @Description:com.qst.di
 * @version:1.0
 */
public class Hero {
    private String name01;
    private Car car01;

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public void setCar01(Car car01) {
        this.car01 = car01;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name01='" + name01 + '\'' +
                ", car01=" + car01 +
                '}';
    }
}
