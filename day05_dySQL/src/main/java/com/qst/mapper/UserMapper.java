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
}
