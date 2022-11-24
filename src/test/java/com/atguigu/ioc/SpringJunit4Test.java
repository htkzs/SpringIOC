package com.atguigu.ioc;

import com.atguigu.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName : SpringJunit4Test
 * @Description : Spring的测试类
 * @Author : 20609
 * @Date: 2022/11/22  20:44
 */
/*
1.首先导入依赖报spring-test
2.标注配置文件的位置
3.指定使用Spring的单元测试进行测试
 */
@ContextConfiguration(locations = "classpath:application01.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringJunit4Test {
    @Autowired
    private BookController bookController;
    @Test
    public void saveBook(){
        bookController.saveBook();
    }
}



