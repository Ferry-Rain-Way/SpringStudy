package com.nfjh.autowireTest.dao.impl;

import com.nfjh.autowireTest.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoForTX implements UserDao {
    @Override
    public void insert() {
        System.out.println("通信学生信息插入中");
    }
}
