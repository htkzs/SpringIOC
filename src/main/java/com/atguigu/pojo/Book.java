package com.atguigu.pojo;

/**
 * @ClassName : Book
 * @Description : book实体类
 * @Author : 20609
 * @Date: 2022/11/22  13:58
 */
public class Book {
    private String bookName;
    private double bookPrice;
    private Integer bookPage;
    private double thickNess; //厚度
    public void initBook(){
        System.out.println("Book对象初始化完成后调用该方法");
    }
    public void DestroyBook(){
        System.out.println("IOC容器关闭时调用该方法");
    }

    public Book() {
        System.out.println("Bean实例化调用了Bean的无参构造方法");
    }

    public Book(String bookName, double bookPrice, Integer bookPage, double thickNess) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookPage = bookPage;
        this.thickNess = thickNess;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public double getThickNess() {
        return thickNess;
    }

    public void setThickNess(double thickNess) {
        this.thickNess = thickNess;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPage=" + bookPage +
                ", thickNess=" + thickNess +
                '}';
    }
}
