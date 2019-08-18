package com.mxh.dubbo.springbootorderservices;

import com.mxh.dubbo.IOrderService;
import com.mxh.dubbo.dto.Order;

public class IOrderServiceMock implements IOrderService {
    @Override
    public String sayHello(String s) {
        return "调用OrderService异常，返回兜底数据";
    }

    @Override
    public Order addOrder(String s) {
        Order order = new Order();
        order.setOrderAddr("兜底数据");
        return  order;
    }
}
