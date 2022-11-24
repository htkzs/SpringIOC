package com.itheima.spring;

import com.atguigu.pojo.Student;
import com.itheima.service.BaseService;
import com.itheima.service.BookService;
import com.itheima.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName : SpringJunit4Test
 * @Description : spring单元测试
 * @Author : 20609
 * @Date: 2022/11/22  21:30
 */
@ContextConfiguration(locations = "classpath:application02.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringJunit4Test {
    @Autowired
    private BaseService<Student> baseService;
    @Test
    public void save(){
        baseService.save();
        System.out.println(baseService.getClass().getSuperclass());
        System.out.println(baseService.getClass().getGenericSuperclass());
    }
}
