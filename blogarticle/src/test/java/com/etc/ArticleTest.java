package com.etc;

import com.etc.dao.ArticleDaoRepository;
import com.etc.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class ArticleTest {
    @Resource
    ArticleDaoRepository articleDaoRepository;

    @Test
    public void ArticleByUidTest(){
        List<Article> articles = articleDaoRepository.findAllByUid(6);
        for (Article article: articles)
            System.out.println(article);
    }

    @Test
    public void Test(){
        Integer i = null;
        System.out.println(i);
    }
}
