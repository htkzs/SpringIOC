package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName : Student
 * @Description : 学生实体类
 * @Author : 20609
 * @Date: 2022/11/22  12:42
 */
public class Student {
    private Integer stuNo;
    private String stuName;
    private Integer stuAge;
    private String stuGender;
    //使用constructor-arg做属性注入时，使用的是带参构造方法注入
    public Student(Integer stuNo, String stuName, Integer stuAge, String stuGender) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
        System.out.println("Student对象被创建出来...........");
    }
    //通过property和p命名空间做属性填充时都是用的set方法注入
    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }
}
