package com.qf.service.dao.impl;

import com.qf.pojo.User;
import com.qf.service.dao.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<String> userList;

    private List<User> allUser;
    public void setAllUser(List<User> allUser) {
        this.allUser = allUser;
    }
    @Override
    public void show2(){
        System.out.println(allUser);
    }



    public void setUsers(List<String> lala) {
        this.userList = lala;
    }

    @Override
    public void show(){
        System.out.println(userList);
    }
}
