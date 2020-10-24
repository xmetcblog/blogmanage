package com.etc.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/validate")
    @ResponseBody
    public User validate(String username, String password){
        System.out.println("请求成功！！");
        return userService.login(username,password);
    }

}
