package com.sq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:44
 */


@RestController
@Slf4j
public class ConsumerController {
    public static final String INVOKE_URL = "http://cloud-payment-zkserver";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo()
    {
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
