package com.qst.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.homework
 * @version:1.0
 */
public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        userDao = new UserDao();
        System.out.println("万事俱备");
    }

    @Test
    public void add() {
        System.out.println("东风来了");
        userDao.add();
    }
}