package com.sq.controller;

import com.sq.entitys.CommonResult;
import com.sq.entitys.Payment;
import com.sq.feign.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午11:00
 */

@RestController
@Slf4j
public class ConsumerFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping (value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable ("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }
    
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
