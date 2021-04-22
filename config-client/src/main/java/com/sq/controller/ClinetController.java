package com.sq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/22 上午9:12
 */

@RestController 
@RefreshScope
public class ClinetController {
    
    @Value ("${config.info}")
    private String configInfo;

    @Value ("${server.port}")
    private String port;
    
    @GetMapping ("/configInfo")
    public String getConfigInfo() {
        return "port:" + port  + "---" + "configInfo: " + configInfo;
    }

}
