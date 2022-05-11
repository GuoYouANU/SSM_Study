package com.guoyou.service.impl;

import com.guoyou.dao.UserDao;
import com.guoyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//    <bean id="userService" class="com.guoyou.service.impl.UserServiceImpl">
@Service("userService")
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    //按照数据 类型 从Spring容器中进行匹配的
    @Autowired
    //按照Bean的id值从容器中进行匹配的，但是主要此处要结合@Autowired一起使用
    //@Qualifier("userDao")
    //@Resource相当于@Qualifier+@Autowired
    @Resource(name = "userDao")
    private UserDao userDao;

    //注解方式不需要谢set方法，xml方式需要写set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("init method");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destroy method");
    }
}
