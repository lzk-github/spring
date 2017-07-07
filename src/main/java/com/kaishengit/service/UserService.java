package com.kaishengit.service;

import com.kaishengit.dao.DeptDao;
import com.kaishengit.dao.UserDao;

/**
 * Created by lzk on 2017/7/7.
 */
public class UserService {

    private UserDao userDao;
    private DeptDao deptDao;


    public UserService(UserDao userDao1,DeptDao deptDao1) {
        this.userDao = userDao1;
        this.deptDao = deptDao1;
    }

    public void save() {
        userDao.save();
        deptDao.saveDept();
    }


//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    public void setDeptDao(DeptDao deptDao) {
//        this.deptDao = deptDao;
//    }
}
