package com.sq.controller;

import com.sq.entitys.CommonResult;
import com.sq.entitys.Payment;
import com.sq.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:37
 */

@RestController
@Slf4j
public class PaymentController {
    
    @Resource
    private PaymentService paymentService;
    @Value ("${server.port}")
    private String port;
    
    //只传给前端CommonResult，不需要前端了解其他的组件
    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if(result > 0){
            return new CommonResult<>(200,"插入数据成功" + port,result);
        }
        
        return new CommonResult<>(444,"插入数据失败",null);
        
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+payment);
        if(payment != null){
            return new CommonResult<> (200, "查询成功"+ port, payment);
        }
         
        return new CommonResult<>(444,"没有对应记录,查询ID："+id,null);
        
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return port;//返回服务接口
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
    

}
