package com.nfjh.Resource.service;

import com.nfjh.Resource.dao.StudentDao;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Resource//(name = "studentDaoImpl")
    private StudentDao studentDaoProp;


//    @Resource
//    private StudentDao studentDaoProp;


    public void delStu(){
        studentDaoProp.delete();
    }
}
