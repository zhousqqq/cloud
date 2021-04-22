package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 下午7:20
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigConter {

    public static void main (String[] args) {
        SpringApplication.run (ConfigConter.class,args);
    }
}
