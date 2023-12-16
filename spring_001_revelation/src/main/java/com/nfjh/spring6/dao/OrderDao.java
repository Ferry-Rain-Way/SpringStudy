package com.nfjh.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderDao {
    private Logger logger = LoggerFactory.getLogger(OrderDao.class);
    public void insert(){
        logger.debug("订单正在生成！");
    }
}
