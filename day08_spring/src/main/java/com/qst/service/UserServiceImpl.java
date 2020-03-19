package com.qst.service;

import com.qst.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/19
 * @Description:com.qst.service
 * @version:1.0
 */
@Service("userService02")
public class UserServiceImpl implements UserService {

    @Value("#{userDao}")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        System.out.println("业务层登陆... ....");
        userDao.findUP();
    }
}
