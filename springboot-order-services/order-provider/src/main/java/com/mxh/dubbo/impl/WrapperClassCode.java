//package com.mxh.dubbo.impl;
//
//import org.apache.dubbo.rpc.proxy.javassist.JavassistProxyFactory;
//
///**
// * Created by Maxiaohong on 2019-09-08.
// */
//public class WrapperClassCode {
//
//    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
//        com.mxh.dubbo.impl.OrderServiceImpl w;
//        try {
//            w = ((com.mxh.dubbo.impl.OrderServiceImpl) $1);
//        } catch (Throwable e) {
//            throw new IllegalArgumentException(e);
//        }
//        try {
//            if ("addOrder".equals($2) && $3.length == 1) {
//                return ($w) w.addOrder((java.lang.String) $4[0]);
//            }
//            if ("sayHello".equals($2) && $3.length == 1) {
//                return ($w) w.sayHello((java.lang.String) $4[0]);
//            }
//        } catch (Throwable e) {
//            throw new java.lang.reflect.InvocationTargetException(e);
//        }
//        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class com.mxh.dubbo.impl.OrderServiceImpl.");
//    }
//
//    ListenerExporterWrapper(ProtocolFilterWrapper(JavassistProxyFactory))
//}
