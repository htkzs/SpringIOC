package com.itheima.dao;

import com.atguigu.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : BookDao
 * @Description : 图书持久化层
 * @Author : 20609
 * @Date: 2022/11/22  21:20
 */
@Repository
public class BookDao extends BaseDao<Book>{
    @Override
    public void save() {
        System.out.println("保存图书信息 BookDao被调用");
    }
}
