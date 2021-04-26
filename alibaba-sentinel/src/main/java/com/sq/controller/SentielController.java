package com.sq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 上午10:08
 */
@RestController
@Slf4j
public class SentielController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping ("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "------testB";
    }

}
