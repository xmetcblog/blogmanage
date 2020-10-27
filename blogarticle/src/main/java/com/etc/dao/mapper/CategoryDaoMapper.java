package com.etc.dao.mapper;

import com.etc.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryDaoMapper {
    Category findAllByCondition(@Param("id") Integer id,@Param("cateName") String cateName);
}
