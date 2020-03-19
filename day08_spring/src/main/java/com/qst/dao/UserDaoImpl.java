package com.qst.dao;

import org.springframework.stereotype.Repository;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/19
 * @Description:com.qst.dao
 * @version:1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void findUP() {
        System.out.println("根据用户名和密码查询数据库... ...");
    }
}
