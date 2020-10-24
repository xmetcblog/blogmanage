package com.etc.service.serviceImpl;

import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDaoRepository userDaoRepository;
    @Override
    public List<User> findAllUser() {
        return userDaoRepository.findAll();
    }

    @Override
    public User login(String username,String password) {
        return userDaoRepository.findUserByUserNameAndPassword(username,password);
    }
}
