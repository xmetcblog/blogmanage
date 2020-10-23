package com.etc.dao.mapper;

import com.etc.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleDaoMapper {
    List<Article> findAll();
}
