package com.qst.curd;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/20
 * @Description:com.qst.curd
 * @version:1.0
 */
public class UserDao extends JdbcDaoSupport {
    //1.增加
    public void add(User user) {
        String sql = "INSERT INTO user (id,username,password,nickname) VALUES (NULL ,?, ?, ?)";

        Object[] paramArray = {user.getUsername(), user.getPassword(), user.getNickname()};

        this.getJdbcTemplate().update(sql, paramArray);
    }

    //2.修改
    public void update(User user) {
        String sql = "UPDATE USER SET username=?, password=? ,nickname=? WHERE id=?";
        Object[] paramArr = {user.getUsername(), user.getPassword(), user.getNickname(), user.getId()};
        this.getJdbcTemplate().update(sql, paramArr);
    }

    //3.删除
    public void delById(int id) {
        String sql = "DELETE FROM USER WHERE id=?";
        this.getJdbcTemplate().update(sql, id);
    }

    //4.根据编号查询
    public String queryNameById(int id) {
        String sql = "SELECT nickname FROM USER WHERE id=?";
        String nickname = this.getJdbcTemplate().queryForObject(sql, String.class, id);
        return nickname;
    }

    //5.查询总条数
    public int queryCount() {
        String sql = "SELECT COUNT(*) FROM USER";
        Integer count = this.getJdbcTemplate().queryForObject(sql, Integer.class);
        return count;

    }
}
