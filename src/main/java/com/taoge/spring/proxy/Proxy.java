package com.taoge.spring.proxy;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

public class Proxy {


//    public static void main(String[] args) {
//        Enhancer enhancer=new Enhancer();
//        enhancer.setSuperclass(Dog.class);
//        enhancer.setCallback(new Interceptor(new SimpleAcpect()));
//        Dog o = (Dog)enhancer.create();
//        int eat = o.eat(10);
//        System.out.println(eat);
//    }

//    public static void main(String[] args) {
//        Class clazz=Dog.class;
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for(Method temp:declaredMethods){
//            System.out.println(temp.getName());
//        }
//
//    }



}
