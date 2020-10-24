package com.etc.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/validate")
    public User validate(String username, String password){
        System.out.println("请求成功！！");
        User login = userService.login(username, password);
        System.out.println(username);
        System.out.println(password);
        System.out.println(login);
        return userService.login(username,password);
    }

}

