package com.etc;

import com.etc.dao.CategoryDaoRepository;
import com.etc.dao.CommentsDaoRepository;
import com.etc.dao.mapper.ArticleDaoMapper;
import com.etc.dao.ArticleDaoRepository;
import com.etc.entity.Article;
import com.etc.entity.Category;
import com.etc.entity.Comments;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BlogarticleApplicationTests {

    @Resource
    ArticleDaoRepository articleDaoRepository;
    @Resource
    CommentsDaoRepository commentsDaoRepository;
    @Resource
    CategoryDaoRepository categoryDaoRepository;

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
    int i;
    @Test
    public void ArticleMybatisTest(){
        List<Article> articles = articleDaoMapper.findAllOrCon(10);
        for (Article article: articles)
            System.out.println(article);
    }

    @Test
    public void CommentsJpaTest(){
        List<Comments> comments = commentsDaoRepository.findAll();
        for (Comments comment: comments)
            System.out.println(comment);
    }

    @Test
    public void CategoryJpaTest(){
        List<Category> categories = categoryDaoRepository.findAll();
        for (Category category: categories)
            System.out.println(category);
    }

}
