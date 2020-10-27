package com.etc.service;

import com.etc.entity.Category;

import java.util.List;

public interface CategoryService {

    //通过id查询所有的目录
    Category findAllById(Integer id);
    List<Category> findAll();


}
