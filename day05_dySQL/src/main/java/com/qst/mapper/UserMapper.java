package com.qst.mapper;

import com.qst.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询所有
    List<User> queryAll();

    //根据编号查询
    User queryById(Long id);

    //需求1：查询所有男性用户， 如果输入了姓名，则按照姓名模糊查找；
    // 如果没有输入则不管姓名
    List<User> queryAllMale(@Param("name") String name);

    //需求2：查询所有用户，传递参数orderType，如果值为0，按照年龄升序排序，
    //如果为1则按照年龄降序排序，否则按照ID排序
    List<User> queryAllSort(@Param("orderType01") String orderType);

    //需求3：查询所有用户， 如果有姓名不为空，则按照姓名模糊查找；
    //如果年龄也不为空，则还要满足年龄小于指定年龄。
    List<User> queryAllByNA(@Param("name") String name, @Param("age") Integer age);

    //需求4：修改用户信息，如果某字段为null，则不修改这个字段
    void updateUser(User user);

    //需求5：根据多个ID查询用户
    List<User> queryAllByIds(@Param("ids") List<Integer> ids);

    void delUser(Long id);
}
