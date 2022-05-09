package com.guoyou.dao.impl;

import com.guoyou.dao.UserDao;
import org.springframework.stereotype.Component;

//<bean id="userDao" class="com.guoyou.dao.impl.UserDaoImpl"/>
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running");
    }
}
