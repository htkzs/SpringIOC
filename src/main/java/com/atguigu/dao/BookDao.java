package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName : BookDao
 * @Description : 数据库持久层
 * @Author : 20609
 * @Date: 2022/11/22  19:08
 */
@Repository
public class BookDao {

    public void save(){
        System.out.println("保存图书信息");
    }

}
