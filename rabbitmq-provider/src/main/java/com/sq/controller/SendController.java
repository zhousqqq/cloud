package com.sq.controller;

import com.sq.message.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 下午9:16
 */
@RestController
@Slf4j
public class SendController {

    @Resource
    private IMessageProvider messageProvider;
    
    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
    
}
