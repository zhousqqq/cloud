package com.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 下午9:49
 */

@SpringBootApplication
@EnableJms //启动消息队列
public class ActiveConsumer {

    public static void main (String[] args) {
        SpringApplication.run (ActiveConsumer.class,args);
    }
}

