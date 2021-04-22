package com.sq.feign;

import com.sq.entitys.CommonResult;
import com.sq.entitys.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午10:58
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVER")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();

}
