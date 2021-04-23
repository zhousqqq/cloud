package com.sq;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 上午9:30
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AliConsumer {
    public static void main (String[] args) {
        SpringApplication.run (AliConsumer.class,args);
    }
}
