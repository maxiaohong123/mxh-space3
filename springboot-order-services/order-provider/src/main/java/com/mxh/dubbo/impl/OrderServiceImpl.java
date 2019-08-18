package com.mxh.dubbo.impl;

import com.mxh.dubbo.IOrderService;
import com.mxh.dubbo.dto.Order;
import org.apache.dubbo.config.annotation.Service;


@Service(loadbalance = "random",timeout = 50000,cluster = "failsafe")
public class OrderServiceImpl implements IOrderService {
    @Override
    public String sayHello(String name) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return name+":sayHello";
    }

    @Override
    public Order addOrder(String orderName) {
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
       Order order = new Order();
       order.setId(111);
       order.setOrderNo(orderName);
       order.setOrderAddr("中国山西临汾");
       return order;
    }
}
