package com.mxh.dubbo.springbootorderservices;

/**
 * Created by Maxiaohong on 2019-09-13.
 */
public class Proxy0 {
    public java.lang.String sayHello(java.lang.String arg0){
        Object[] args = new Object[1];
        args[0] = ($w)$1;
        Object ret = handler.invoke(this, methods[0], args); return (java.lang.String)ret;
    }
}
