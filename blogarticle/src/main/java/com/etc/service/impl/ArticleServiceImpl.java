package com.etc.service.impl;

import com.etc.dao.ArticleDaoRepository;
import com.etc.dao.mapper.ArticleDaoMapper;
import com.etc.entity.Article;
import com.etc.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleDaoRepository articleDaoRepository;
    @Resource
    ArticleDaoMapper articleDaoMapper;

    @Override
    public List<Article> findAllArticle() {
        List<Article> articles = articleDaoRepository.findAll();
        return articles;
    }

    @Override
    public List<Article> findByUid(Integer uid) {
        List<Article> articles = articleDaoRepository.findAllByUid(uid);
        return null;
    }


    @Override
    public PageInfo<Article> pageArticleById(Integer pageNum, Integer pageSize, Integer uid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Article> articles = articleDaoMapper.findAllOrCon(uid);
        PageInfo<Article> pageInfo =new PageInfo<>(articles);
        return pageInfo;
    }

    @Override
    public int editArticle(Article article) {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        article.setEditTime(timestamp);
        return articleDaoMapper.updateArticle(article);
    }
}
