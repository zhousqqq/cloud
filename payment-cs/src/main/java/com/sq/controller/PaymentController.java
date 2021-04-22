package com.sq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午5:24
 */
@RestController
@Slf4j
public class PaymentController {
    @Value ("${server.port}")
    private String serverPort;

    @RequestMapping (value = "/payment/consul")
    public String paymentConsul () {
        return "springcloud with consul: " + serverPort + "\t   " + UUID.randomUUID ().toString ();
    }
}

