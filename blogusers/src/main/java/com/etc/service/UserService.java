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
    PageInfo<User> pageUserByCondition(Integer pageNum, Integer pageSize, User user);
    //更新是否可用状态
    void upUserState(User user);
    //删除用户
    void delUserByID(Integer uid);
    //更新用户
    void modUserByID(User user);
    //添加用户
    void addUser(User user);

}
