package com.guoyou.demo;

import com.guoyou.service.UserService;
import com.guoyou.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//模拟web层

public class UserController {

    public static void main(String[] args) {
        //web层始终调用的是service
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
