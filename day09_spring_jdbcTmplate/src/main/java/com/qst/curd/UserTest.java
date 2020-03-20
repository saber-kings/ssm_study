package com.qst.curd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:user.xml")
public class UserTest {

    @Value("#{userDao}")
    private UserDao userDao;

    @Test
    public void demo01() {
        User user = new User();
        user.setUsername("lpz");
        user.setPassword("123456");
        user.setNickname("林平之");
        userDao.add(user);
    }

    @Test
    public void demo02() {
        User user = new User();
        user.setId(4);
        user.setUsername("rwx");
        user.setPassword("123456");
        user.setNickname("任我行");
        userDao.update(user);
    }

    @Test
    public void demo03() {
        userDao.delById(1);
    }

    @Test
    public void demo04() {
        String name = userDao.queryNameById(2);
        System.out.println(name);
    }

    @Test
    public void demo05() {
        int count = userDao.queryCount();
        System.out.println(count);
    }

}
