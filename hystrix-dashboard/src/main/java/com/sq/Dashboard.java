package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 下午1:58
 */

@SpringBootApplication
@EnableHystrixDashboard
public class Dashboard {

    public static void main (String[] args) {
        SpringApplication.run (Dashboard.class,args);
    }
}
