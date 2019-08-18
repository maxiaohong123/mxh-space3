package com.mxh.dubbo.springbootorderservices;

import com.mxh.dubbo.IOrderService;
import com.mxh.dubbo.dto.Order;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference(loadbalance = "roundrobin",timeout = 1,cluster ="failfast",check = false,mock = "com.mxh.dubbo.springbootorderservices.IOrderServiceMock")
    //注意：如果采用的是直连N/A连接服务端，则需要提供url地址。默认采用dubbo协议,协议格式  dubbo://ip:port/接口全路径名
     IOrderService iOrderService;


    @RequestMapping("sayHello")
    public String sayHello(@RequestParam(value = "name" ,required = false)String name){

        String result = iOrderService.sayHello(name);
        return result;
    }

    @RequestMapping("test")
    public String test(@RequestParam(value = "name" ,required = false)String name){

        Order order = iOrderService.addOrder(name);
        return order.toString();
    }
}
