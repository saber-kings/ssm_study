package com.qst.mapper;

import com.qst.domain.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/17
 * @Description:com.qst.mapper
 * @version:1.0
 */
public class OrderMapperTest {
    private OrderMapper orderMapper;
    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }

    @Test
    public void query01() {
        Order order = orderMapper.query01("20200221001");
        System.out.println(order);
    }

    @Test
    public void query02() {
        Order order = orderMapper.query02("20200221001");
        System.out.println(order);
    }

    @Test
    public void query03() {
        Order order = orderMapper.query03("20200221001");
        System.out.println(order);
    }
}