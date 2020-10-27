package com.etc.controller;

import com.etc.entity.Category;
import com.etc.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @RequestMapping("/queryCategoryById/{id}")
    @ResponseBody
    public Category QueryCategory(@PathVariable("id") Integer id){
        Category category = categoryService.findAllById(id);
        return category;
    }
    @RequestMapping("/queryCategoryAll")
    @ResponseBody
    public List<Category> QueryAll() {
        List<Category> categories = categoryService.findAll();
        return categories;
    }
}
