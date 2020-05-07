package com.qst.controller;

import com.qst.domain.Book;
import com.qst.domain.User;
import com.qst.domain.UserForm;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: Saber污妖王
 * TODO: 测试注解 Controller
 * @UpdateUser: luanz
 * @Project: ssm_study_parents
 * @Date: 2020/3/26
 * @Package: com.qst.controller
 * @Version: 0.0.1
 */
@Controller
public class TestController {

    @RequestMapping("/showMsg")
    public ModelAndView showMsg() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "我是一个快乐的SpringMVC程序!" + format.format(new Date()));
        return mv;
    }

    @RequestMapping("/showBook")
    public ModelAndView showBook() {
        List<Book> bookList = getBooks();

        ModelAndView mv = new ModelAndView("book_list");
        mv.addObject("bookList", bookList);
        return mv;
    }

    @RequestMapping("/showBookJson")
    //告诉SpringMVC可以把集合转换成json格式的字符串
    @ResponseBody
    public List<Book> showBookJson() {
        return getBooks();
    }

    private List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("葵花宝典-" + i + ".0版");
            book.setPrice(9.9 + i);
            bookList.add(book);
        }
        return bookList;
    }

    //需求：只是返回视图名称即只需要跳转功能
    @RequestMapping("/showIndex")
    public ModelAndView showIndex() {
        return new ModelAndView("index");
    }

    //重定向到 showMsg.do
    @RequestMapping("/showRedirect")
    public String showRedirect() {
        return "redirect:showMsg.do";
    }

    //请求转发到 showMsg.do
    @RequestMapping("/showForward")
    public String showForward() {
        return "forward:showMsg.do";
    }

    //既不想返回视图名称,也不想返回模型数据
    @RequestMapping("/showStatus")
    @ResponseStatus(HttpStatus.OK)
    public void showStatus() {
        System.out.println("我收到了您的命令，但是我什么也不做");
    }

    //获取servlet的相关对象,如 request, response. session等
    @RequestMapping("/showScope")
    public ModelAndView showScope(HttpServletRequest request,
                                  HttpServletResponse response,
                                  HttpSession session) {
        request.setAttribute("msg1", "我是request,我存放了数据:request=" + request);
        request.setAttribute("msg2", "我是response,我存放了数据,response=:" + response);
        session.setAttribute("msg3", "我是session,我存放了数据,session=" + session);

        return new ModelAndView("servlet-test");
    }

    //获取路径占位符参数
    @RequestMapping("/showPathParam/{name}/{age}")
    public ModelAndView showPathParam(@PathVariable String name,
                                      @PathVariable int age
    ) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "获取路径占位符中的值：name=" + name + ",age=" + age);
        return mv;
    }

    //获取表单提交的参数
    @RequestMapping("/showFormParam")
    @ResponseStatus(HttpStatus.OK)
    public void showFormParam(@RequestParam("name") String name,
                              @RequestParam("age") int age,
                              @RequestParam("income") double income,
                              @RequestParam("isMarried") boolean isMarried,
                              @RequestParam("interests") String[] interests) {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("收入:" + income);
        System.out.println("是否婚否:" + isMarried);
        System.out.println("爱好:" + Arrays.toString(interests));
    }

    //接收表单中的参数到 JavaBean
    @RequestMapping("/showJavaBean")
    @ResponseStatus(HttpStatus.OK)
    public void showJavaBean(User user){
        System.out.println("接收JavaBean的数据:"+user);
    }

    //获取普通参数
    @RequestMapping("/showParam")
    public ModelAndView showParam(@RequestParam(required = false) String username){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "接收到普通参数：username=" + username);
        return mv;
    }

    //获取 cookies 的值
    @RequestMapping("/showJsessionid")
    public ModelAndView showJsessionid(@CookieValue("JSESSIONID") String jsessionid){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "接收到 cookie 的值：JSESSIONID=" + jsessionid);
        return mv;
    }

    //接收表单采纳数封装到 UserList 集合中
    @RequestMapping("/showUserList")
    public ModelAndView showUserList(UserForm userForm){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg","接受集合数据:userForm.users="+userForm.getUsers());
        return mv;
    }
}
