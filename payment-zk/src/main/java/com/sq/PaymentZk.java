package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午4:01
 */

@SpringBootApplication
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class PaymentZk {
    public static void main (String[] args) {
        SpringApplication.run (PaymentZk.class,args);
    }
    
}
