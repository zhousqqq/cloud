package com.selfRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午8:03
 */

@Configuration
public class MySelfRule {
    
    @Bean
    public IRule myRule(){
        return new RandomRule ();
    }
}
