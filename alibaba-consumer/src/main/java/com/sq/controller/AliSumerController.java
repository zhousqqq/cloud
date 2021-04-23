package com.sq.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/23 上午9:35
 */

@ResponseBody
@Controller
public class AliSumerController {
    @Resource
    private RestTemplate restTemplate;

    @NacosInjected
    private NamingService namingService;

    @GetMapping (value = "/get")
    @ResponseBody
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }


    /**
     * 被注册的服务
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        return hello(name);
    }

    public String hello(String name) {
        return "hello, " + name;
    }
    
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        System.out.println (serverURL + "/payment/nacos/"+id );
        
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }


}
