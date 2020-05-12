package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudGatewayPredicateApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringcloudGatewayPredicateApplication.class, args );
    }

    @GetMapping("hi")
    public String hi(){
        return "测试";
    }
    @GetMapping("oh")
    public String oh(){
        return "我在这儿呢";
    }

}

