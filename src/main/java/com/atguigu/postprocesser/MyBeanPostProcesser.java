package com.atguigu.postprocesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName : MyBeanPostProcessor
 * @Description : Bean的后置处理器
 * @Author : 20609
 * @Date: 2022/11/22  15:02
 */
class MyBeanPostProcessor implements BeanPostProcessor {
    /**
    * @Param :  Object bean 要初始化的Bean  String beanName 容器中配置的Bean的id
    * @Description :  初始化方法之前调用
    * @Author : 20609
    * @Date : 2022/11/22 15:12
    */

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean+"的初始化方法调用之前，调用后置处理器的postProcessBeforeInitialization方法");
        return bean;
    }
    /**
    * @Param :
    * @Description :  初始化方法之后调用
    * @Author : 20609
    * @Date : 2022/11/22 15:14
    */

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean+"的初始化方法调用完了，调用后置处理器的postProcessAfterInitialization方法");
        return bean;
    }
}
