package com.qst.web;

import com.qst.domain.User;
import com.qst.service.UserService;
import com.qst.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.web
 * @version:1.0
 */
public class UserServlet extends HttpServlet {

    //当表单提交方式为Post时执行
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    //当表单提交方式为Get时执行
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //实例化Service服务层对象
        UserService us = new UserServiceImpl();

        //执行查询所有用户对象的方法
        List<User> list = us.findAll();

        //将用户List集合发送给user_list.jsp页面
        request.setAttribute("userlist",list);
        request.getRequestDispatcher("/user_list.jsp").forward(request,response);
    }
}
