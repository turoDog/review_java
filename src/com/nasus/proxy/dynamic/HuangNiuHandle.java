package com.nasus.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy.dynamic <br/>
 * Date:2019/5/12 14:16 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class HuangNiuHandle implements InvocationHandler {

    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object methodObject = null;

        /*System.out.println("line up");
        methodObject = method.invoke(proxyTarget, args);*/

        if ("lookConcert".equals(method.getName()) ||
        "seeADoctor".equals(method.getName())) {
            System.out.println("line up");
            methodObject = method.invoke(proxyTarget, args);
        } else {
            //不使用第一个proxy参数作为参数，否则会造成死循环
            methodObject = method.invoke(proxyTarget, args);
        }

        return methodObject;
    }

}
