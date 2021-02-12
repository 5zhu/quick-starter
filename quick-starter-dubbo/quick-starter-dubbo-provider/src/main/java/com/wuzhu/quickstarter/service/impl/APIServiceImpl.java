package com.wuzhu.quickstarter.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wuzhu.quickstarter.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = HelloService.class)
public class APIServiceImpl implements HelloService {


    @Override
    public String getMessage(String msg) {
        return "Service Provider:[quick-starter-dubbo-provider]" + " message : " + msg;
    }
}
