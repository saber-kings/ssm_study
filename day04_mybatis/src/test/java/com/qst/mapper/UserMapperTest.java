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

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/13
 * @Description:com.qst.mapper
 * @version:1.0
 */
public class UserMapperTest {

    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void findAll() {
        List<User> userList = userMapper.findAll();
        //iter
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void findById() {
        User user = userMapper.findById(3);
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("王启年");
        user.setAttack(3000);
        userMapper.insertUser(user);
        System.out.println("恭喜你,添加成功!");
    }

    @Test
    public void updateUser() {
        //先根据id查询
        User user = userMapper.findById(1);

        user.setUserName("陈萍萍");
        user.setAttack(4000);

        userMapper.updateUser(user);
        System.out.println("恭喜你,修改成功了!");

    }

    @Test
    public void deleteUser() {
        userMapper.deleteUser(1);
    }

    @Test
    public void findByName() {
        List<User> userList = userMapper.findByName("吉");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
}