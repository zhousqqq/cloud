package com.sq.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 上午9:31
 */
@Configuration
public class ApplicationContextConfig {
    
    @Bean
    @LoadBalanced  // 开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate ();
    }

}
