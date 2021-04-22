package com.sq.listener;

import javafx.scene.control.Skin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 下午9:23
 */

@Component
@EnableBinding(Sink.class)
public class MessageLiatenerController {

    @Value ("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println ("port " + port + "消费消息 + " + message.getPayload ());
    }
}
