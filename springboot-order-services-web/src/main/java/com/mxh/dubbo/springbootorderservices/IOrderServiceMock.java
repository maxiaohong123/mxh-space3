package com.mxh.dubbo.springbootorderservices;

import com.mxh.dubbo.IOrderService;

public class IOrderServiceMock implements IOrderService {
    @Override
    public String sayHello(String s) {
        return "调用OrderService异常，返回兜底数据";
    }
}
