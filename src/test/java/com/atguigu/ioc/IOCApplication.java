package com.atguigu.ioc;

import com.atguigu.factory.MyFactoryBean;
import com.atguigu.pojo.Animals;
import com.atguigu.pojo.Book;
import com.atguigu.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : IOCApplication
 * @Description : IOC测试类
 * @Author : 20609
 * @Date: 2022/11/22  12:48
 */

public class IOCApplication {
    private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    /**
    * @Param :  测试单实例的bean的创建过程
    * @Description :   测试结果为true 表明从容器中获取两次获取的Bean为同一个Bean
     *                 同时使用的是带参构造方法创建的，构造方法只被调用了一次
    * @Author : 20609
    * @Date : 2022/11/22 13:05
    */

    @Test
    public void StudentBeanTest(){
        Student student = context.getBean("student01", Student.class);
        System.out.println(student);
        Student student1 = context.getBean("student01", Student.class);
        //student对象没有重写equals() 这里做地址比较
        System.out.println(student==student1);
    }
    /**
    * @Param :  测试多实例的Bean的创建过程 scope="prototype"
    * @Description : 测试结果为
     *               Student对象被创建出来...........
     *               Student{stuNo=1234, stuName='zhangsan', stuAge=23, stuGender='男'}
     *               Student对象被创建出来...........
     *               false
     *               总结：调用两次构造方法，创建的两个Bean不是同一个Bean
    * @Author : 20609
     *
    * @Date : 2022/11/22 13:08
    */

    @Test
    public void StudentBeanTest01(){
        Student student = context.getBean("student01", Student.class);
        System.out.println(student);
        Student student1 = context.getBean("student01", Student.class);
        //student对象没有重写equals() 这里做地址比较
        System.out.println(student==student1);
    }

    /**
    * @Param :  测试使用静态工厂和实例工厂创建对象
    * @Description :
    * @Author : 20609
    * @Date : 2022/11/22 13:39
    */
    @Test
    public void getAnimalInstance(){
        Animals animal = context.getBean("animal", Animals.class);
        System.out.println(animal);
        Animals animal01 = context.getBean("animal01", Animals.class);
        System.out.println(animal01);

    }

    /**
    * @Param :
    * @Description :  使用FactoryBean 创建Bean实例 在获取MyFactoryBean 时机获取到的是getObject()方法返回的Bean对象
    * 通过方法中获取IOC  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
     * 发现使用FactoryBean在IOC启动的时候即使是单例bean 也不会被创建，只有在getBean()的时候才会被创建。
     * @Author : 20609
    * @Date : 2022/11/22 14:08
    */
    @Test
    public void getBookInstanceByFactoryBean(){

        Book book = (Book) context.getBean("MyFactoryBean");
        System.out.println(book);
        Book book2 = (Book) context.getBean("MyFactoryBean");
        System.out.println(book == book2);
    }

}
