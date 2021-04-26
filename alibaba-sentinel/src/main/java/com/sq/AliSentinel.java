package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 下午4:14
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AliSentinel {

    public static void main (String[] args) {
        SpringApplication.run (AliSentinel.class,args);
    }
}
