package com.sq.conf;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.jms.Queue;
import javax.jms.Topic;


/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 下午9:46
 */

@Component
public class ActiveMQClient {
    
    @Value ("${mq.queue}")
    private String queue;

    //定义存放消息的队列
    @Bean
    public Queue queue() {
        return new ActiveMQQueue (queue);
    }

    @Bean   //将主题对象交给spring管理
    public Topic topic(){
        return new ActiveMQTopic ("topic");
    }
}