package com.atguigu.ioc;

import com.atguigu.pojo.Book;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : LifyCycleBean
 * @Description : 测试单例多例情况下Bean的生命周期的不同
 * @Author : 20609
 * @Date: 2022/11/22  14:28
 */
public class LifyCycleBean {
    private ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifycycle.xml");

    /**
    * @Param :
    * @Description :  测试单例情况下的Bean生命周期
     * IOC启动时调用Book类的无参构造方法初始化Bean -->初始化化完成后调用initBook()方法-->容器Close() 后调用DestroyBook()方法
    * @Author : 20609
    * @Date : 2022/11/22 14:42
    */
    @Test
    public void lifyCycleTest(){
        Book book = context.getBean("book01", Book.class);
        System.out.println(book);
        //容器销毁的时候会调用生命周期的destroy()方法
        context.close();
        /* 测试结果
        Bean实例化调用了Bean的无参构造方法
        Book对象实例化完成后调用该方法
        Book{bookName='null', bookPrice=0.0, bookPage=null, thickNess=0.0}
        IOC容器关闭时调用该方法
         */

    }
    /**
    * @Param :  测试多例情况下的Bean生命周期
    * @Description : IOC启动时调用Book类的无参构造方法初始化Bean -->初始化化完成后调用initBook()方法-->容器Close() 后调不会调用DestroyBook()方法
    * @Author : 20609
    * @Date : 2022/11/22 14:46
    */
    @Test
    public void lifyCycleTestForPrototype(){
        Book book = context.getBean("book01", Book.class);
        System.out.println(book);
        //容器销毁的时候会调用生命周期的destroy()方法
        context.close();
        /* 测试结果：
        Bean实例化调用了Bean的无参构造方法
        Book对象实例化完成后调用该方法
        Book{bookName='null', bookPrice=0.0, bookPage=null, thickNess=0.0}

         */

    }

}
