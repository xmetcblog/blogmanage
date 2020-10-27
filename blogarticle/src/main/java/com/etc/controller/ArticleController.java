package com.etc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.etc.dao.ArticleDaoRepository;
import com.etc.entity.Article;
import com.etc.service.ArticleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin("*")
@RestController
@RequestMapping("/article")
public class ArticleController {

/*
    Dao层直接测试
    @Resource
    ArticleDaoRepository articleDaoRepository;

    @RequestMapping("/findAllArticle")
    public List<Article> findAllArticle(){
        return articleDaoRepository.findAll();
    }

    @RequestMapping("/findArticleByUid/{uid}")
    public List<Article> findArticleByUid(@PathVariable Integer uid){
        return articleDaoRepository.findAllByUid(uid);
    }
    @RequestMapping("/JsonAricleFindByUid/{uid}")
    public Map[] JsonAricleFindByUid(@PathVariable Integer uid){
        List<Article> articles = articleDaoRepository.findAllByUid(uid);
        Map[] map = new Map[10];
        for (int i=0;i < articles.size(); i++){
            map[i] = new HashMap();
            JSON json = (JSON) JSON.toJSON(articles.get(i));
            Map<String, Object> mapUser = JSONObject.parseObject(json.toString());
            map[i].putAll(mapUser);
        }
        return map;
    }
*/
    @Resource
    ArticleService articleService;

    //根据用户ID条件分页

    @RequestMapping("/PageAllArticleOrCon")
    public PageInfo<Article> PageAllArticleOrCon(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 Integer uid){
        PageInfo page = articleService.pageArticleById(pageNum, pageSize, uid);
        return page;
    }

    //修改文章内容
    @RequestMapping("/updateArticle")
    public void updateArticle(Article article){

    }
}
