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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UserMapperTest {

    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void queryAll() {
        //一次会话中
        System.out.println("====================第一次查询====================");
        List<User> userList = userMapper.queryAll();
        for (User user : userList) {
            System.out.println(user);
            System.out.println("========================================");
        }
        //测试增删改清空缓存
        //userMapper.delUser(3L);
        //测试手动清空缓存
        //sqlSession.clearCache();
        sqlSession.close();
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println("********************第二次查询********************");
        List<User> userList1 = userMapper.queryAll();
        for (User user : userList1) {
            System.out.println(user);
            System.out.println("****************************************");
        }

    }

    @Test
    public void queryById() {
        User user = userMapper.queryById(4L);
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

    @Test
    public void queryAllByNA() {
        List<User> userList = userMapper.queryAllByNA("萧", 60);
        for (User user : userList) {
            System.out.println(user);
            System.out.println("========================================");
        }
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(3L);
        user.setName("毁了乔峰一生的女人");
        userMapper.updateUser(user);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void queryAllByIds() {
        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
        Collections.addAll(list,2,4,6);
        List<User> userList = userMapper.queryAllByIds(list);
        for (User user : userList) {
            System.out.println(user);
            System.out.println("--------------------------------");
        }
    }
}