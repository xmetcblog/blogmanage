package com.etc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "eureka-article")
public interface ArticleFeign {

    @RequestMapping(value = "/article/JsonAricleFindByUid/{uid}", method = RequestMethod.GET)
    Map[] getArticleByUid(@PathVariable Integer uid);
}
