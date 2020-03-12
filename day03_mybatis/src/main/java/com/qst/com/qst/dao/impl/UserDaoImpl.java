package com.qst.com.qst.dao.impl;

import com.qst.com.qst.dao.UserDao;
import com.qst.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.com.qst.dao.impl
 * @version:1.0
 */
public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryById(Integer id) {
        return sqlSession.selectOne("userMapper.queryById", id);
    }

    @Override
    public List<User> queryUserList() {
        return sqlSession.selectList("userMapper.queryUserList");
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("userMapper.insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("userMapper.updateUser", user);
    }

    @Override
    public void deleteById(Integer id) {
        sqlSession.delete("userMapper.deleteById", id);
    }

}
