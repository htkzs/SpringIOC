package com.atguigu.ioc;

import com.atguigu.controller.BookController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : AnnotationTest
 * @Description : 注解方式注入Bean
 * @Author : 20609
 * @Date: 2022/11/22  18:51
 */
public class AnnotationTest {
    @Test
    public void getBeanByAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application01.xml");
        Object bookController = context.getBean("bookController");
        System.out.println(bookController);

    }
    /**
    * @Param :
    * @Description :  测试@Autowired注解
    * @Author : 20609
    * @Date : 2022/11/22 19:35
    */
    @Test
    public void saveBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application01.xml");
        BookController bookController = context.getBean(BookController.class);
        System.out.println(bookController);
        bookController.saveBook();

    }
}
