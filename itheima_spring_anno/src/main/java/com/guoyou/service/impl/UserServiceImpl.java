package com.guoyou.service.impl;

import com.guoyou.dao.UserDao;
import com.guoyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//    <bean id="userService" class="com.guoyou.service.impl.UserServiceImpl">
@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
