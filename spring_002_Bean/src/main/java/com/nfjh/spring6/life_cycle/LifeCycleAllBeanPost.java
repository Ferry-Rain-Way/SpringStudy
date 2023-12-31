package com.nfjh.spring6.life_cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleAllBeanPost  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //初始化之前执行
        System.out.println("Bean后处理器的before方法执行，即将开始初始化");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //初始化之后执行
        System.out.println("Bean后处理器的after方法执行，已完成初始化");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
