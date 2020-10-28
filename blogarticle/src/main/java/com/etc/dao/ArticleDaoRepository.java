package com.etc.dao;

import com.etc.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
import java.util.List;

public interface ArticleDaoRepository extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article>, Serializable {
    List<Article> findAllByUid(Integer uid);

    //根据文章id查询文章内容
    Article findArticleById(Integer id);
}
