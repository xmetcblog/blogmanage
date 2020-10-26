package com.etc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.etc.entity.User;
import com.etc.feign.ArticleFeign;
import com.etc.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    ArticleFeign articleFeign;

    @RequestMapping("/validate")
    public User validate(String username, String password, HttpSession session){
        System.out.println("请求成功！！");
        User user = userService.login(username, password);
        session.setAttribute("user",user);
        return user;
    }

    @RequestMapping("/getUserAndArticle")
    public Map[] getUserAndArticle(String username, String password){
        User login = userService.login(username, password);
        Map[] map = articleFeign.getArticleByUid(login.getId());
        //转json
        for (int i=0; i<map.length; i++){
            if(map[i] == null){
                map[i] = new HashMap();
                JSON json = (JSON)JSON.toJSON(login);
                Map<String, Object> mapUser = JSONObject.parseObject(json.toString());
                map[i].putAll(mapUser);
                break;
            }
        }
        return map;
    }
}

