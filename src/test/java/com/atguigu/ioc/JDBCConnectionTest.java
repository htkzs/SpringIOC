package com.atguigu.ioc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @ClassName : JDBCConnectionTest
 * @Description : JDBC连接池测试
 * @Author : 20609
 * @Date: 2022/11/22  15:59
 */
public class JDBCConnectionTest {
    @Test
    public void getConnection(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifycycle.xml");
        ComboPooledDataSource dataSource = context.getBean(ComboPooledDataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
