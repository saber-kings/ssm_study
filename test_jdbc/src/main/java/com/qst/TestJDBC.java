package com.qst;

import java.sql.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/10
 * @Description:com.qst
 * @version:1.0
 */
public class TestJDBC {

    public static void main(String[] args) {
        try {
            //2.注册驱动（投奔莆田少林，成为少林的俗家弟子）
            Class.forName("com.mysql.cj.jdbc.Driver");
            //3.获取连接对象（找到主持）
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_mybatis_db?useSSL=false&serverTimezone=GMT%2B8","root","admin123");
            //4.根据连接对象，获取可以操作SQL语句的对象（在煮吃的指引下，找到一位武学高僧）
            Statement state = conn.createStatement();
            //Ctrl + Y
            //5.执行SQL语句，获取结果（集）（给了你一本葵花宝典）
            ResultSet rs = state.executeQuery("select * from user");
            //6.操作结果集（练习葵花宝典）
            while (rs.next()){
                System.out.println(rs.getInt("id")+"..."+rs.getString("user_name")+rs.getInt("attack"));
            }
            //7.释放资源（烧宝典 拜别师傅 拜别主持 下山报仇）
            rs.close();
            state.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
