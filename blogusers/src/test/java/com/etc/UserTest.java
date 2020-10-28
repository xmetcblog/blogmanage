package com.etc;

import com.etc.dao.UserDaoMapper;
import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserTest {
    @Resource
    UserDaoRepository userDaoRepository;
    @Resource
    UserDaoMapper userDaoMapper;
    @Resource
    UserService userService;

    @Test
    public void DelUserTest(){
        userDaoRepository.deleteById(21);
    }
    @Test
    public void DelUserTest1(){
        userDaoMapper.DelUser(22);
    }
    @Test
    public void DelUserTest2(){
        userService.DelUser(23);
    }

    @Test
    public void UpdateUserState(){
        User user = new User();
        user.setEnabled(0);
        user.setId(25);
        user.setUserName("haugnqin");
        userService.UpUserState(user);
    }


}
