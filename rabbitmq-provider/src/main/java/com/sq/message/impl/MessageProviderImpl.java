package com.sq.message.impl;

import com.sq.message.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 下午9:13
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;
    
    @Override
    public String send () {
        String string = UUID.randomUUID ().toString ();
        output.send (MessageBuilder.withPayload (string).build ());
        System.out.println ("uuid : " + string);
        return null;
    }
}
