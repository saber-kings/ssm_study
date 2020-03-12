package com.qst.com.qst.dao;

import com.qst.domain.User;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.com.qst.dao
 * @version:1.0
 */
public interface UserDao {
    //根据编号查询用户
    User queryById(Integer id);
    //查询所有用户
    List<User> queryUserList();
    //添加用户
    void insertUser(User user);
    //修改用户
    void updateUser(User user);
    //根据编号删除用户
    void deleteById(Integer id);
}
