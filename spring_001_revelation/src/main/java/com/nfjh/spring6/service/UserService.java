package com.nfjh.spring6.service;

import com.nfjh.spring6.dao.UserDao;

public class UserService {
    private UserDao userdao;
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
    public void saveUser(){
        userdao.insert();
    }
}
