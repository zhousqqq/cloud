package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 下午2:28
 */

@SpringBootApplication
@EnableEurekaClient
public class GateWay {
    public static void main (String[] args) {
        SpringApplication.run (GateWay.class,args);
    }
}
