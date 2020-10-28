package com.etc;

import com.etc.dao.ArticleDaoRepository;
import com.etc.dao.mapper.ArticleDaoMapper;
import com.etc.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class ArticleTest {
    @Resource
    ArticleDaoRepository articleDaoRepository;
    @Resource
    ArticleDaoMapper articleDaoMapper;

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

    //测试文章的修改
    @Test
    public void updateArticle(){
        Article article = new Article();
        article.setId(124);
        article.setTitle("测试数据1");
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        article.setEditTime(timestamp);
        articleDaoMapper.updateArticle(article);
    }
    //测试文章删除
    @Test
    public void deleteArticle(){
        articleDaoRepository.deleteById(126);
    }
}
