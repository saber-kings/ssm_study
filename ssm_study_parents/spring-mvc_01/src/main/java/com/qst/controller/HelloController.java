package com.qst.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Author: Saber污妖王
 * TODO: 测试 SpringMVC: 实现Controller接口,表示当前类是处理器类
 * @UpdateUser: luanz
 * @Project: ssm_study_parents
 * @Date: 2020/3/26
 * @Package: com.qst.controller
 * @Version: 0.0.1
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 创建模型和视图对象
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置模型数据
        mv.addObject("msg", "这是我的第一个SpringMVC程序! " + new Date().toLocaleString());
        return mv;
    }
}
