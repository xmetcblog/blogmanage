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
@RestController
@RequestMapping("/article")
@CrossOrigin("*")
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
    public int updateArticle(Integer id, String title){
        int i = articleService.editArticle(id, title);
        return i;
    }

    //删除文章
    @RequestMapping("/deleteArticle")
    public void deleteArticle(Integer id){
        articleService.deleteArticle(id);
    }

    //根据文章id查询文章
    @RequestMapping("/findArticleById")
    public Article findArticleById(Integer id){
        return articleService.findArticleByid(id);
    }

    //根据文章id修改mdContent和htmlContent
    @RequestMapping("/updateArticleById")
    public int updateArticleById(Article article){
        return articleService.upArticle(article);
    }

    //添加文章
    @RequestMapping("addArticle")
    public void addArticle(Article article){
        articleService.addArticle(article);
    }
}
