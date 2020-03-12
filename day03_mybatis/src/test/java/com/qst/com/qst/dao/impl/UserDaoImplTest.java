package com.qst.com.qst.dao.impl;

import com.qst.com.qst.dao.UserDao;
import com.qst.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.com.qst.dao.impl
 * @version:1.0
 */
public class UserDaoImplTest {

    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        userDao = new UserDaoImpl(sqlSession);
    }

    @Test
    public void queryById() {
        User user = userDao.queryById(1);
        System.out.println(user);
    }

    @Test
    public void queryUserList() {
        List<User> users = userDao.queryUserList();
        System.out.println(users);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("中神通");
        user.setAttack(18000);
        userDao.insertUser(user);
    }

    @Test
    public void updateUser() {
        User user = userDao.queryById(5);
        user.setUserName("周伯通");
        user.setAttack(9000);
        userDao.updateUser(user);
    }

    @Test
    public void deleteById() {
        userDao.deleteById(1);
    }
}