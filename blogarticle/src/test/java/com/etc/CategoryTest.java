package com.etc;

import com.etc.dao.CategoryDaoRepository;
import com.etc.dao.mapper.CategoryDaoMapper;
import com.etc.entity.Category;
import com.etc.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CategoryTest {

    @Resource
    private CategoryDaoRepository categoryDaoRepository;
    @Resource
    private CategoryService categoryService;
    @Resource
    private CategoryDaoMapper categoryDaoMapper;

    @Test
    public void CategoryTest(){
        List<Category> list = categoryDaoRepository.findAll();

            System.out.println(list);


    }

    @Test
    public void CategoryById(){
        Category category = categoryDaoRepository.findAllById(56);
        System.out.println(category);
    }
    @Test
    public void CategoryById1(){
        Category category = categoryService.findAllById(56);
        System.out.println(category);
    }

    @Test
    public void Test(){
        Category category = categoryDaoMapper.findAllByCondition(56,"null");
        System.out.println(category);
    }
}
