package com.mxh.dubbo;

import com.mxh.dubbo.api.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});

        OrderService payService=(OrderService) classPathXmlApplicationContext.
                getBean("orderService");

        String rs=payService.sayHello("maxiaohong"); //pay方法一定是远程调用
        System.out.println(rs);
    }
}
