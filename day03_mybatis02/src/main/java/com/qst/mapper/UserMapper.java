package com.qst.mapper;

import com.qst.domain.User;
import org.apache.ibatis.annotations.Param;

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
    //根据用户名和密码查询
    User findUP(@Param("username") String username, @Param("password") String password);
}
