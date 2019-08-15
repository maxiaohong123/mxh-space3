package com.mxh.dubbo;

import com.mxh.dubbo.api.PayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/order-consumer.xml");
        PayService payService = (PayService) context.getBean("payService");
        String str = payService.getPayCount("maxiaohong");
        System.out.println(str);
    }
}
