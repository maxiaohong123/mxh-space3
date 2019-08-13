package com.mxh.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/order-provicer.xml");
//        context.start();
//        System.out.println("order service started");
        Main.main(args);
    }
}
