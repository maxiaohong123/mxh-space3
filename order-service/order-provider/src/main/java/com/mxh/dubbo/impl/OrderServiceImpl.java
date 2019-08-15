package com.mxh.dubbo.impl;

import com.mxh.dubbo.api.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }

}
