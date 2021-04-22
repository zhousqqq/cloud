package com.sq.service.impl;

import com.sq.service.PaymentService;
import com.sq.dao.PaymentDao;
import com.sq.entitys.Payment;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:35
 */

@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
