package com.atguigu.factory;

import com.atguigu.pojo.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName : MyFactoryBean
 * @Description : spring可以认识的并自动创建的Bean工厂
 * @Author : 20609
 * @Date: 2022/11/22  13:57
 */
public class MyFactoryBean implements FactoryBean<Book> {
    /**
    * @Param :  由于该工厂是一个实现FactoryBean 是Spring可以认识的工厂，在获取bean的时候Spring会自动调用
     *          getObject() 方法创建Bean实例。
    * @Description :
    * @Author : 20609
    * @Date : 2022/11/22 14:01
    */

    @Override
    public Book getObject() throws Exception {
        System.out.println("Book对象被创建.........");
        return new Book();
    }
    /**
    * @Param :
    * @Description :  返回创建的bean的对象类型
    * @Author : 20609
    * @Date : 2022/11/22 14:03
    */

    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }
    /**
    * @Param :
    * @Description :   控啊创建对象是否是单实例 return true 是单例 false不是单例
     *                 通过FactoryBean创建的Bean无论单实例还是多实例都是在获取bean的时候才创建，不是在IOC启动之前就创建好
    * @Author : 20609
    * @Date : 2022/11/22 14:03
    */

    @Override
    public boolean isSingleton() {
        return true;
    }
}
