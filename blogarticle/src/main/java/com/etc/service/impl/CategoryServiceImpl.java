package com.etc.service.impl;


import com.etc.dao.CategoryDaoRepository;
import com.etc.entity.Category;
import com.etc.service.CategoryService;
import org.hibernate.annotations.Source;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Resource
    private CategoryDaoRepository categoryDaoRepository;


    @Override
    public Category findAllById(Integer id) {
        Category category = categoryDaoRepository.findAllById(id);
        return category;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = categoryDaoRepository.findAll();
        return categories;
    }
}
