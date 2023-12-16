package com.nfjh.Resource.dao.impl;

import com.nfjh.Resource.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository//("studentDaoProp")
public class StudentDaoImpl  implements StudentDao {

    @Override
    public void delete() {
        System.out.println("学生信息删除....");
    }
}
