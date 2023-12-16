package com.nfjh.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {
        private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
        public void insert(){
                logger.debug("User保存信息到数据库!\n");
        }
}
