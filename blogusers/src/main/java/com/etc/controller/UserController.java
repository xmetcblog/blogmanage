package com.etc.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/validate")
    public User validate(String username, String password, HttpSession session){
        System.out.println("请求成功！！");
        User user = userService.login(username, password);
        session.setAttribute("user",user);
        return user;
    }

}

