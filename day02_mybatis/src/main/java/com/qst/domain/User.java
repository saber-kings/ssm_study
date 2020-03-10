package com.qst.domain;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/11
 * @Description:com.qst.domain
 * @version:1.0
 */
public class User {
    private Integer id;
    private String userName;
    private Integer attack;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", attack=" + attack +
                '}';
    }
}
