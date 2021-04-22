package com.sq.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:45
 */

@Configuration
public class ApplicationContextConfig {
    @Bean
    // @LoadBalanced // 需要使用#LoadBalanced注解开启RestTemplate负载均衡功能。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
