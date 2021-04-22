package com.sq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午11:18
 */


@SpringBootApplication
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }
}
