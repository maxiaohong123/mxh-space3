package com.mxh.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mxh.dubbo")
public class OrderProviderApplication {

    public static void main(String[] args) {
        System.out.println("aaaa");
        SpringApplication.run(OrderProviderApplication.class, args);
    }

}
