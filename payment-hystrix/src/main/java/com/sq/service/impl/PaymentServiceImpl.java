package com.sq.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sq.service.PaymentServies;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午11:37
 */
@Service
public class PaymentServiceImpl implements PaymentServies {


    @Override
    public String paymentInfo_Ok (Integer id) {
        
        return "线程池:" + Thread.currentThread ().getName () + "paymentInfo_Ok, id:" + id +"\t" + "hhhh";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler" ,
            // 超时 服务降级
            commandProperties = {@HystrixProperty (name = "execution.isolation.thread.timeoutInMilliseconds",value = "4000")})
    public String paymentInfo_TimeOut (Integer id) {

        // int age = 10/0;
        
        try {
            TimeUnit.MILLISECONDS.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        return "线程池:" + Thread.currentThread ().getName () + "paymentInfo_TimeOut, id:" + id +"\t" + "sleep 3 秒";
    }

    //用来善后的方法
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:  "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }
}
