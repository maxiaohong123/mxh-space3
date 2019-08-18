package com.mxh.dubbo;

import com.mxh.dubbo.dto.Order;

public interface IOrderService {

    String sayHello(String name);

    Order addOrder(String orderName);

}
