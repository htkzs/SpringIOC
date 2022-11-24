package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : BookService
 * @Description : 业务逻辑层
 * @Author : 20609
 * @Date: 2022/11/22  19:07
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void saveBook(){
        bookDao.save();
    }
}
