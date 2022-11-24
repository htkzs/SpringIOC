package com.itheima.service;

import com.itheima.dao.BaseDao;
import com.itheima.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName : BaseService
 * @Description : 基本逻辑
 * @Author : 20609
 * @Date: 2022/11/22  21:39
 */
public class BaseService<T> {
    @Autowired
    private BaseDao<T> baseDao;
    public void save(){
        baseDao.save();
    }
}
