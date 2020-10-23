package com.etc;

import com.etc.dao.mapper.ArticleDaoMapper;
import com.etc.dao.ArticleDaoRepository;
import com.etc.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class BlogarticleApplicationTests {

    @Resource
    ArticleDaoRepository articleDaoRepository;

    @Resource
    ArticleDaoMapper articleDaoMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void ArticleJpaTest(){
        List<Article> articles = articleDaoRepository.findAll();
        for(Article article : articles){
            System.out.println(article);
        }
    }

    @Test
    public void ArticleMybatisTest(){
        List<Article> articles = articleDaoMapper.findAll();
        for (Article article: articles)
            System.out.println(article);
    }
}
