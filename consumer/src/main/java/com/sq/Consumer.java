package com.sq;

import com.selfRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:42
 */

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient (name = "CLOUD-PAYMENT-SERVER", configuration = MySelfRule.class)
public class Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}
