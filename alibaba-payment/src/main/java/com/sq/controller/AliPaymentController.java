package com.sq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 上午9:19
 */

@RestController
public class AliPaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello::"+"123";
    }
}
