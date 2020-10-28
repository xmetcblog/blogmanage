package com.etc.service;

import com.etc.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ArticleService {
    //查询所有文章内容
    List<Article> findAllArticle();
    //根据uid查找文章内容
    List<Article> findByUid(Integer uid);

    //分页查询所有或者用户文章
    public PageInfo<Article> pageArticleById(Integer pageNum, Integer pageSize, Integer uid);

    //修改文章标题、内容、时间
    public int editArticle(Integer id, String title);

    //删除文章
    public void deleteArticle(Integer id);

    //根据文章id查询文章
    public Article findArticleByid(Integer id);

    //添加文章
    void addArticle(Article article);
}
