package com.etc.service;

import com.etc.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAllUser();
    //登录验证
    User login(String username,String password);
    //分页查询所有或者用户文章
    public PageInfo<User> pageUserByCondition(Integer pageNum, Integer pageSize, Integer uid);

}
