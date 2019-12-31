package com.nasus.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy.dynamic <br/>
 * Date:2019/5/12 14:16 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class HuangNiuHandle implements MethodInterceptor {

    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        return Enhancer.create(target.getClass(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object methodObject = null;

        if ("lookConcert".equals(method.getName()) ||
                "seeADoctor".equals(method.getName())) {
            System.out.println("line up");
            // 调用目标方法
            methodObject = methodProxy.invokeSuper(proxy, args);
        } else {
            methodObject = method.invoke(proxyTarget, args);
        }

        return methodObject;
    }
}
