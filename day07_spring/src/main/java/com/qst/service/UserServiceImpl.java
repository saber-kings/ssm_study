package com.qst.service;

import com.qst.dao.UserDao;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.qst.service
 * @version:1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void findAll() {
        //1.传统方式 在程序创建实现类对象 耦合度高
//        UserDao userDao = new UserDaoImpl();
        //1.创建Spring的IOC容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取Bean
//        UserDao userDao = ac.getBean("userDao", UserDao.class);
        System.out.println("业务层登录... ...");

        userDao.findUP();
    }
}
