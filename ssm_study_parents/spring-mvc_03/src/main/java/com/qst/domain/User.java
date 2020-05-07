package com.qst.domain;

import java.util.Arrays;

/**
 * @Author: Saber污妖王
 * TODO: 用户信息类
 * @UpdateUser: luanz
 * @Project: ssm_study_parents
 * @Date: 2020/3/27
 * @Package: com.qst.domain
 * @Version: 0.0.1
 */
public class User {
    private String name;
    private int age;
    private double income;
    private boolean isMarried;
    private String[] interests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", isMarried=" + isMarried +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
