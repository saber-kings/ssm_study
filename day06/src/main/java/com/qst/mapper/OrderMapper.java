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

    //需求2:查询订单的同时，查询出订单所属用户,并且查询出所有订单详情
    Order query02(@Param("orderNumber") String orderNumber);

    //需求3：查询订单的同时，查询出订单所属用户,并且查询出所有订单详情，
    //及订单详情中的对应的商品信息
    Order query03(@Param("orderNumber") String orderNumber);

}
