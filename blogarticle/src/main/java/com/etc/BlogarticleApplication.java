package com.etc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.etc.dao.mapper")
public class BlogarticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogarticleApplication.class, args);
    }

}
