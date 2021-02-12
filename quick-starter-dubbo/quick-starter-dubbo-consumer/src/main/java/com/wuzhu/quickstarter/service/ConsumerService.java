package com.wuzhu.quickstarter.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Reference(url = "dubbo://localhost:20880")
    HelloService helloService;

    public String getMessage(String name) {
        return helloService.getMessage(name);
    }
}
