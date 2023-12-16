package com.myspring.nfjh;

public class UserService {
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
