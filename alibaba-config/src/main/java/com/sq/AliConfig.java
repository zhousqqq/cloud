package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 下午12:54
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AliConfig {

    public static void main (String[] args) {
        SpringApplication.run (AliConfig.class,args);
    }
}
