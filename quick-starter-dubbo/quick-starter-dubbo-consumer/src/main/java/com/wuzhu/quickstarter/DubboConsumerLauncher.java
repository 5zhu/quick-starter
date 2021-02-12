package com.wuzhu.quickstarter;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.wuzhu.quickstarter.service.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DubboConsumerLauncher.class, args);
        ConsumerService consumerService = (ConsumerService) run.getBean("consumerService");

        String mes = consumerService.getMessage("wuzhu");
        System.out.println(mes);

    }
}
