package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : BookServiceExt
 * @Description : BookService的一个重写
 * @Author : 20609
 * @Date: 2022/11/22  19:40
 */
@Service
public class BookServiceExt extends BookService{
    @Autowired
    private BookDao bookDao;
    @Override
    public void saveBook(){
        bookDao.save();
    }

}
