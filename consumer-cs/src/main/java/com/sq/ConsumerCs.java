package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午7:17
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerCs {
    public static void main (String[] args) {
        SpringApplication.run (ConsumerCs.class,args);
    }
}
