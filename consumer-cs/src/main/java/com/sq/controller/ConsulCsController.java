package com.sq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午7:22
 */

@RestController
@Slf4j
public class ConsulCsController {

    public static final String INVOKE_URL = "http://consul-provider-servercs";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }

}
