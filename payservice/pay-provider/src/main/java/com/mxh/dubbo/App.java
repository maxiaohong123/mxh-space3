package com.mxh.dubbo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws  Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/pay-provider.xml"});
        context.start();
//        Main.main(args); //Dubbo提供的启动类方法，它会启动dobbu中配置的多个container
        System.out.println("provider started");
        System.in.read(); // 按任意键退出
    }
}
