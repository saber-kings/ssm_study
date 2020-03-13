package com.qst.mapper;

import com.qst.domain.User;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.mapper
 * @version:1.0
 */
public interface UserMapper {
    //查询所有用户
    List<User> findAll();
    //根据id查询
    User findById(Integer id);
    //添加用户
    void insertUser(User user);
    //修改用户
    void updateUser(User user);
    //根据id 删除用户
    void deleteUser(Integer id);

    //模糊查询
    List<User> findByName(String username);
}
