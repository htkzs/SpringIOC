package com.itheima.dao;

import com.atguigu.pojo.Student;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : UserDao
 * @Description : 用户持久化层
 * @Author : 20609
 * @Date: 2022/11/22  21:21
 */
@Repository
public class StudentDao extends BaseDao<Student>{

    @Override
    public void save() {
        System.out.println("保存用户信息 StudentDao被调用");
    }
}
