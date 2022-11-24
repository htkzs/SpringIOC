package com.atguigu.pojo;

/**
 * @ClassName : Animals
 * @Description : 动物实体
 * @Author : 20609
 * @Date: 2022/11/22  13:25
 */
public class Animals {
    private String animalName;
    private String variety; //品种
    private Integer number; //数量
    private Double weight; //重量
    private Double length; //长度

    public Animals() {
    }

    public Animals(String animalName, String variety, Integer number, Double weight, Double length) {
        this.animalName = animalName;
        this.variety = variety;
        this.number = number;
        this.weight = weight;
        this.length = length;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalName='" + animalName + '\'' +
                ", variety='" + variety + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
