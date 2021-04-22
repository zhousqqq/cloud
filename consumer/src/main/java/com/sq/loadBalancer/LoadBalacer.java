package com.sq.loadBalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalacer {
    
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
    
}
