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
public class UserDaoImplExt implements UserDao {
    @Override
    public void add() {
        System.out.println("权限校验...");
        System.out.println("添加用户...");
        System.out.println("日志记录...");
    }

    @Override
    public void delete() {
        System.out.println("权限校验...");
        System.out.println("删除用户...");
        System.out.println("日志记录...");
    }

    @Override
    public void update() {
        System.out.println("权限校验...");
        System.out.println("修改用户...");
        System.out.println("日志记录...");
    }

    @Override
    public void find() {
        System.out.println("权限校验...");
        System.out.println("查询用户...");
        System.out.println("日志记录...");
    }
}
