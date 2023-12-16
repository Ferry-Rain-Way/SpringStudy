package com.nfjh.spring6.factory;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBeanImpl implements FactoryBean<Date> {
    private String strDate;

    public DateFactoryBeanImpl(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
