package com.sq.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 下午9:49
 */


@Component
@Slf4j
public class ActiveMQServer {
    
    // 使用JmsListener配置消费者监听的队列，其中name是接收到的消息
    @JmsListener(destination="queue", containerFactory = "queueListenerContainerFactory")
    public void receive3(Message message, Session session) throws JMSException {
        TextMessage textmessage = (TextMessage)message;
        System.out.println("queue 消费者:receive3="+ textmessage.getText());
        try {
            if (!textmessage.getText().contains("sq")) {
                throw new JMSException("故意抛出的异常");
            }
            message.acknowledge();
        } catch (JMSException e) {
            System.out.println(String.format("触发重发机制msg = %s",textmessage.getText()));
            session.recover();
        }
    }

    @JmsListener(destination="topic", containerFactory = "topicListenerContainerFactory")
    public void receive1(String text){
        System.out.println("topic 消费者:receive1="+text);
    }
    
    @JmsListener(destination="topic", containerFactory = "topicListenerContainerFactory")
    public void receive2(String text){
        System.out.println("topic 消费者:receive2="+text);
    }


}
