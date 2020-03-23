package com.qst.horizontal_extract;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_study
 * @Date: 2020/3/23
 * @Description: 描述信息
 * @Package: com.qst.horizontal_extract
 * @Version: 0.0.1
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户...");
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }

    @Override
    public void find() {
        System.out.println("查询用户...");
    }
}
