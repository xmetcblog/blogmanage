package com.etc.controller;

import com.etc.entity.Category;
import com.etc.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @RequestMapping("/queryCategoryById/{id}")
    public Category QueryCategory(@PathVariable("id") Integer id){
        Category category = categoryService.findAllById(id);
        return category;
    }
    @RequestMapping("/queryCategoryAll")
    public List<Category> QueryAll() {
        List<Category> categories = categoryService.findAll();
        System.out.println("请求成功");
        return categories;
    }
}
