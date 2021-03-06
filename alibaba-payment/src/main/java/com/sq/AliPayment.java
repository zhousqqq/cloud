package com.sq;

import com.alibaba.nacos.api.annotation.NacosProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 下午10:11
 */

@SpringBootApplication
public class AliPayment {

    public static void main(String[] args) {
        SpringApplication.run(AliPayment.class, args);
    }
}
