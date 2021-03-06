package com.etc;

import com.etc.dao.UserDaoMapper;
import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

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
//    @Test
//    public void DelUserTest1(){
//        userDaoMapper.DelUser(22);
//    }
    @Test
    public void DelUserTest2(){
        User user = new User();
        user.setId(6);
        user.setNickName("令狐冲");
        userDaoMapper.updateUser(user);
    }

    @Test
    public void UpdateUserState(){
        User user = new User();
        user.setEnabled(0);
        user.setId(25);
        user.setUserName("haugnqin");
        userService.upUserState(user);
    }

    @Test
    public void testSelectCon(){
        User user = new User();
        user.setEnabled(1);
        List<User> list = userDaoMapper.findAllByCondition(user);
        for (User u :list){
            System.out.println(u);
        }
    }


}
