package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 上午9:12
 */

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsumerHystrix {
    
    public static void main (String[] args) {
        SpringApplication.run (ConsumerHystrix.class,args);
    }

}
