package com.atguigu.factory;

import com.atguigu.pojo.Animals;

/**
 * @ClassName : AnimalsStaticFactory
 * @Description : 动物静态工厂
 * @Author : 20609
 * @Date: 2022/11/22  13:23
 */
public class AnimalsStaticFactory {
    public static Animals getAnimalsInstance(String name){
        Animals animals = new Animals();
        animals.setAnimalName(name);
        animals.setVariety("哈士奇");
        animals.setNumber(23);
        animals.setWeight(5.23);
        animals.setLength(12.35);
        return animals;
    }
}
