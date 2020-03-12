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
    List<User> findAll();
}
