package com.guoyou.demo;

import com.guoyou.service.UserService;
import com.guoyou.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//模拟web层

public class UserController {

    public static void main(String[] args) {
        //web层始终调用的是service
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据注入bean的id名称获得bean
        UserService userService = (UserService) app.getBean("userService");
        //根据类型获得bean
//        UserService userService1 = app.getBean(UserService.class);
        userService.save();
    }
}
