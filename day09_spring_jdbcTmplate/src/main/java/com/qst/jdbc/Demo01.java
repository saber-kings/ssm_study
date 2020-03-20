package com.qst.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/20
 * @Description:com.qst.jdbc
 * @version:1.0
 */
/* 回顾DButils操作
 * 0 DriverManagerDataSource dataSource = new DriverManagerDataSource(); ....
 * 1 创建对象: QueryRunner qr = new QueryRunner(datasource);
 * 2 书写sql语句: sql = ... ...
 * 3 执行sql, 获取结果: qr.query 或 qr.update
 */
public class Demo01 {
    @Test
    public void test() {
        // 1 创建连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/day09_db?useSSL=false&serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("admin123");
        // 2 创建执行sql的对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        // 3 执行sql [获得结果]
        String sql = "CREATE TABLE user(id INT PRIMARY KEY AUTO_INCREMENT, " +
                " username VARCHAR(50)," +
                " password VARCHAR(50)," +
                " nickname VARCHAR(50))";
        jdbcTemplate.update(sql);
    }
}
