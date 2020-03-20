package com.qst.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/20
 * @Description:com.qst.jdbc
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Demo02 {

    @Value("#{jdbcTemplate}")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test02(){
        String sql = "INSERT INTO user(id, username, password,nickname) VALUES(NULL, ?, ?,?)";
        Object[] paramArray = {"dfbb","8998","东方不败"};
        jdbcTemplate.update(sql, paramArray);
    }

}
