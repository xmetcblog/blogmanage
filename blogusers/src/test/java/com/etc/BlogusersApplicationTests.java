package com.etc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.etc.dao.UserDaoRepository;
import com.etc.entity.User;
import com.etc.feign.ArticleFeign;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BlogusersApplicationTests {

    @Resource
    UserDaoRepository userDaoRepository;
    @Resource
    ArticleFeign articleFeign;

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
    @Test
    void findUserByUserNameAndPassword(){
        User linghu = userDaoRepository.findUserByUserNameAndPassword("linghu", "123");
        System.out.println(linghu);
        System.out.println("asddsa");
    }

    @Test
    public void entityToJson(){
        User login = userDaoRepository.findUserByUserNameAndPassword("linghu","123");
        Map[] map = articleFeign.getArticleByUid(login.getId());
        //转json
        for (Map map1: map){
            if(!map1.isEmpty()){
                JSON json = (JSON)JSON.toJSON(login);
                Map<String, Object> mapUser = JSONObject.parseObject(json.toString());
                map1.putAll(mapUser);
                break;
            }
        }
    }
}
