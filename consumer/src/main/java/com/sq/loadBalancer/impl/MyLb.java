package com.sq.loadBalancer.impl;

import com.sq.loadBalancer.LoadBalacer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/20 下午8:53
 */

@Component
public class MyLb implements LoadBalacer {
    
    private AtomicInteger integer = new AtomicInteger (0);
    

    
    public final int getAndIncrement(){
        int current;
        int next;
        
        do {
            current = this.integer.get ();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.integer.compareAndSet (current,next));
        
        System.out.println ("-----第几次访问,次数:"+ next+"-----" );
        return next;
    }
    //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
    @Override
    public ServiceInstance instances (List<ServiceInstance> serviceInstances) {
        int index =  getAndIncrement () % serviceInstances.size ();
        return serviceInstances.get (index);
    }
}
