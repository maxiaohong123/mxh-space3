package com.dubbo.mxh;

import com.mxh.dubbo.api.ProjectService;
import com.mxh.dubbo.api.SuitService;
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
        ProjectService payService=(ProjectService) classPathXmlApplicationContext.
                getBean("payService");
        String rs=payService.sayHello("maxiaohong"); //pay方法一定是远程调用
        System.out.println(rs);
        SuitService ss = (SuitService) classPathXmlApplicationContext.
                getBean("suitService");
        System.out.println(ss.selectAllName("lilei"));

    }
}
