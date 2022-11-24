package com.atguigu.controller;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @ClassName : BookController
 * @Description : 控制器层
 * @Author : 20609
 * @Date: 2022/11/22  18:45
 */
@Controller
//@Scope(value = "prototype")
public class BookController {

    //    @Autowired
//    private BookService bookService;
//    public void saveBook(){
//        bookService.saveBook();
//    }
    private BookService bookService;

//    @Autowired
//    public void setBookService(BookService bookService) {
//        this.bookService = bookService;
//    }

    /**
     * 加入了@Autowired注解的方法会在Bean创建的时候自动运行
     * 这个方法上的每个参数都会自动注入值
     *
     * @param bookService
     */

    @Autowired
    public void getBookService(@Qualifier(value = "bookServiceExt") BookService bookService01) {
        this.bookService = bookService01;
        System.out.println(bookService);
    }

    public void saveBook(){
        bookService.saveBook();
    }
}
