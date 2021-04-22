package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:19
 */

@SpringBootApplication
@EnableEurekaClient
public class Payment {

    public static void main (String[] args) {
        SpringApplication.run (Payment.class,args);
    }
}
