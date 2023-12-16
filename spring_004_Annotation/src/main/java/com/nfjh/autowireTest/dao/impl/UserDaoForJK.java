package com.nfjh.autowireTest.dao.impl;

import com.nfjh.autowireTest.dao.UserDao;
import org.springframework.stereotype.Repository;

//@Repository
public class UserDaoForJK implements UserDao{
    @Override
    public void insert() {
        System.out.println("计科学生信息插入中");
    }
}
