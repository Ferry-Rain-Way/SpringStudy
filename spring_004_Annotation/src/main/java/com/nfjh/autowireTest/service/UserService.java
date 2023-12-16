package com.nfjh.autowireTest.service;

import com.nfjh.autowireTest.dao.UserDao;
import org.springframework.stereotype.Service;


@Service
public class UserService {
//属性上
//    @Autowired
    private UserDao userDao;

    //set方法上
//    @Autowired
//    @Qualifier("userDaoForJK")
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //构造方法上

//    @Autowired
////    @Qualifier("userDaoForTX")
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


//    public UserService(@Autowired  @Qualifier("userDaoForJK") UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void generate(){
        userDao.insert();
    }

}
