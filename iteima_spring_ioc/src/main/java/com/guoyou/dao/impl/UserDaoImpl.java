package com.guoyou.dao.impl;

import com.guoyou.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl built...");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destory(){
        System.out.println("销毁方法...");
    }
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
