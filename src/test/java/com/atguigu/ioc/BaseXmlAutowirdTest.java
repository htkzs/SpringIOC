package com.atguigu.ioc;

import com.atguigu.pojo.Animals;
import com.atguigu.pojo.Children;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : BaseXmlAutowirdTest
 * @Description : 基于XML的自动装配
 * @Author : 20609
 * @Date: 2022/11/22  16:34
 */
public class BaseXmlAutowirdTest {
    /**
    * @Param :  测试通过设置 autowire="byName" 通过byName自动注入
     *          原理 通过实体类的属性名称和XML中的id对应后，这个id标识的Bean就会被注入到另一个对象中 Children对象中有一个 private Book book; 而IOC中有一个Bean的id正好定义为book
     *              如果容器中不存在与Children实体类属性名称对应的id 将不会被自动装配
     *
     *
    * @Description :
    * @Author : 20609
    * @Date : 2022/11/22 16:36
    */
    private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void getChildrenByName(){

        Children children = context.getBean(Children.class);
        System.out.println(children);
    }
    /**
    * @Param :
    * @Description :   根据设置autowire="byType" 原理 通过Type去IOC中找有没有与要自动注入的字段类型匹配的bean,如果找到一个 就自动装配
     *                 如果根据类型找到多个Bean就会报错 nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.atguigu.pojo.Book' available:
     *                                            expected single matching bean but found 2: book,book01
     *                 如果没有找到就装配NULL
    * @Author : 20609
    * @Date : 2022/11/22 16:49
    */

    @Test
    public void getChildrenByType(){

        Children children = context.getBean(Children.class);
        System.out.println(children);
    }
    /**
    * @Param :
    * @Description :  根据设置autowire="constructor" 原理首先按照构造方法的参数的类型在IOC中找，如果找到唯一的Bean就直接注入，如果没有找到就填充NULL
     *                如果找到多个，不会报错，会再根据参数的名称进行查找。
    * @Author : 20609
    * @Date : 2022/11/22 16:53
    */

    @Test
    public void getChildrenByConstructor(){

        Children children = context.getBean(Children.class);
        System.out.println(children);
    }

    @Test
    public void getAnimals(){
        Animals bean = context.getBean(Animals.class);
        System.out.println(bean);

    }
}

