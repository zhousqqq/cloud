package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午10:56
 */

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeign {

    public static void main (String[] args) {
        SpringApplication.run (ConsumerFeign.class,args);
    }
    
}
