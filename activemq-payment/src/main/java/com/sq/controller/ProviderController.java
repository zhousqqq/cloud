package com.sq.controller;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 下午9:54
 */

@RestController
@Slf4j
public class ProviderController {

    //注入存放消息的队列，用于下列方法一
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    //注入springboot封装的工具类
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
    @RequestMapping("/producer")
    @ResponseBody
    public void send() {
        String msgString = System.currentTimeMillis()+"zjj";
        sendMessage(queue,msgString);
        System.out.println("点对点通讯，msg"+msgString);
    }
    @RequestMapping("/producerTopic")
    @ResponseBody
    public void producerTopic() {
        String msgString = System.currentTimeMillis()+"zjj";
        publish(msgString);
        System.out.println("点对点通讯，msg"+msgString);
    }
    
    //发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    //发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(final String message) {
        jmsMessagingTemplate.convertAndSend(this.queue,message);
    }
    
    public void publish(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }

}
