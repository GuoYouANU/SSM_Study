package com.guoyou.factory;

import com.guoyou.dao.UserDao;
import com.guoyou.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
