package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogusersApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogusersApplication.class, args);
    }

}
