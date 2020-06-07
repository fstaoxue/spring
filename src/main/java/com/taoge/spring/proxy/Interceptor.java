package com.taoge.spring.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Interceptor implements MethodInterceptor {

    private Aspect aspect;

    public Interceptor(Aspect aspect){
        this.aspect=aspect;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        aspect.before();
        Object o1=null;
        try{
            o1 = methodProxy.invokeSuper(o, objects);
        }catch (Exception e){
            aspect.catchEception();
        }
        aspect.after();
        return o1;
    }
}
