package com.qst.controller;

import com.qst.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

}
