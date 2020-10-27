package com.etc.service.serviceImpl;

import com.etc.dao.UserDaoMapper;
import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDaoRepository userDaoRepository;
    @Resource
    UserDaoMapper userDaoMapper;
    @Override
    public List<User> findAllUser() {
        return userDaoRepository.findAll();
    }

    @Override
    public User login(String username,String password) {
        return userDaoRepository.findUserByUserNameAndPassword(username,password);
    }

    @Override
    public PageInfo<User> pageUserByCondition(Integer pageNum, Integer pageSize,User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userDaoMapper.findAllByCondition(user);
        PageInfo<User> pageInfo =new PageInfo<>(list);
        return pageInfo;
    }

}
