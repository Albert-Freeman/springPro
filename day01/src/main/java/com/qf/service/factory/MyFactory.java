package com.qf.service.factory;

import com.qf.service.dao.UserDao;
import com.qf.service.dao.impl.UserDaoImpl;

public class MyFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public UserDao getUserDao2() {
        return new UserDaoImpl();
    }

    public static UserDao getUserDao3(String name,int age) {
        return new UserDaoImpl();
    }

    public UserDao getUserDao4(int id) {
        return new UserDaoImpl();
    }

}
