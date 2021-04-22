package com.sq.feign.fallback;

import com.sq.feign.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/21 下午1:25
 */
@Component
public class AaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_O12K (Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut (Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
