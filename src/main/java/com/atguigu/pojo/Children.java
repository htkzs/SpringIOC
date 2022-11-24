package com.atguigu.pojo;

import java.util.List;

/**
 * @ClassName : Children
 * @Description : 测试基于XML的自动装配原理
 * @Author : 20609
 * @Date: 2022/11/22  16:27
 */
public class Children {
    private Integer childrenNo;
    private String childrenName;
    private Integer childrenAge;
    private Book book;
    private List<Tool> tools;

    public Children() {
    }

    public Children(Book book) {
        this.book = book;
    }

    public Children(Integer childrenNo, String childrenName, Integer childrenAge, Book book, List<Tool> tools) {
        this.childrenNo = childrenNo;
        this.childrenName = childrenName;
        this.childrenAge = childrenAge;
        this.book = book;
        this.tools = tools;
    }

    public Integer getChildrenNo() {
        return childrenNo;
    }

    public void setChildrenNo(Integer childrenNo) {
        this.childrenNo = childrenNo;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public Integer getChildrenAge() {
        return childrenAge;
    }

    public void setChildrenAge(Integer childrenAge) {
        this.childrenAge = childrenAge;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Children{" +
                "childrenNo=" + childrenNo +
                ", childrenName='" + childrenName + '\'' +
                ", childrenAge=" + childrenAge +
                ", book=" + book +
                ", tools=" + tools +
                '}';
    }
}
