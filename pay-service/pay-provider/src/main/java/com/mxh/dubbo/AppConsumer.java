package com.mxh.dubbo;

import com.mxh.dubbo.api.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/pay-consumer.xml");
        OrderService orderService = (OrderService) context.getBean("orderService");
        String str = orderService.sayHello("maxiaohong");
        System.out.println(str);
    }
}
