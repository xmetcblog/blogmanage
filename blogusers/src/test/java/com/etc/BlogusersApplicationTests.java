package com.etc;

import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BlogusersApplicationTests {

    @Resource
    UserDaoRepository userDaoRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void findAllUserTest(){
        List<User> userList = userDaoRepository.findAll();
        for (User user:userList) {
            System.out.println(user);
        }
    }


}
