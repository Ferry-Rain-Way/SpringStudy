package com.nfjh.spring6.factory;

import org.springframework.beans.factory.FactoryBean;

//该类实现了FactoryBean 所以不需要在配置factory-bean
public class FactroyBeanImpl implements FactoryBean<Sweet> {

    //该类重写了getObject ,所以不在需要配置 factory-method
    @Override
    public Sweet getObject() throws Exception {
        return new Sweet();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //返回的对象是否为单例对象,TRUE为单例,FALSE为多例
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
