package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午5:23
 */


@SpringBootApplication
@EnableDiscoveryClient
public class PaymentCs {
    public static void main (String[] args) {
        SpringApplication.run (PaymentCs.class,args);
    }
}
