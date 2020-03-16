package com.qst.mapper;

import com.qst.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
public class UserMapperTest {

    private InputStream inputStream;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void queryAll() {
        List<User> userList = userMapper.queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void queryById() {
        User user = userMapper.queryById(3L);
        System.out.println(user);
    }

    @Test
    public void queryAllMale() {
        List<User> users = userMapper.queryAllMale(" ");
        for (User user : users) {
            System.out.println(user);
            System.out.println("==================================================");
        }
    }

    @Test
    public void queryAllSort() {
        List<User> userList = userMapper.queryAllSort("1");
        for (User user : userList) {
            System.out.println("---------------------------------------------");
            System.out.println(user.getId() + ": " + user.getName() + " ,age = " + user.getAge());
        }
    }


    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }

}