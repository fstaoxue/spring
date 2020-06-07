package com.taoge.spring.proxy;

public class SimpleAcpect implements Aspect{
    @Override
    public void before() {
        System.out.println("before--->");
    }

    @Override
    public void after() {
        System.out.println("after---->");
    }

    @Override
    public void catchEception() {
        System.out.println("try catch--->");
    }
}
