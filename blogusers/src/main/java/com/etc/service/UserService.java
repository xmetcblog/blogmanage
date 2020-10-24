package com.etc.service;

import com.etc.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAllUser();
    //登录验证
    User login(String username,String password);

}
