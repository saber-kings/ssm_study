package com.qst.mapper;

import com.qst.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/17
 * @Description:com.qst.mapper
 * @version:1.0
 */
public interface OrderMapper {
    //需求1：查询订单的同时，查询出订单所属用户
    Order query01(@Param("orderNumber") String orderNumber);
}
