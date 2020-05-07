package com.qst.domain;

import java.util.List;

/**
 * @Author: Saber污妖王
 * TODO: 用户集合类
 * @UpdateUser: luanz
 * @Project: ssm_study_parents
 * @Date: 2020/3/27
 * @Package: com.qst.domain
 * @Version: 0.0.1
 */
public class UserForm {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "users=" + users +
                '}';
    }
}
