package com.mxh.dubbo.impl;

import com.mxh.dubbo.IOrderService;
import org.apache.dubbo.config.annotation.Service;


@Service(loadbalance = "random",timeout = 50000,cluster = "failsafe")
public class OrderServiceImpl implements IOrderService {
    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name+":sayHello";
    }
}
