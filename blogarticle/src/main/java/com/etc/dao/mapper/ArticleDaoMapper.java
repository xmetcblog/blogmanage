package com.etc.dao.mapper;

import com.etc.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleDaoMapper {
    List<Article> findAllOrCon(@Param("uid") Integer uid);

    //修改文章标题、内容、时间
    int updateArticle(@Param("article")Article article);

    //根据文章id修改mdContent和htmlContent
    int updateMdContentAndHtmlContent(@Param("article")Article article);

    //添加文章
    void insertArticle(Article article);
}
