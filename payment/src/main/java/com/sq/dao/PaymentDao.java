package com.sq.dao;


import com.sq.entitys.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/19 下午10:31
 */


@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}