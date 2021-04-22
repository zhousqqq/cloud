package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 上午9:08
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient {

    public static void main (String[] args) {
        SpringApplication.run (ConfigClient.class,args);
    }
    
}
