package com.taoge.spring.bean;

import java.io.Serializable;

public class MyThreadA extends Thread implements Serializable{

    private String name;

    private int order;

    private TestService testService;

    public MyThreadA(String name,int order,TestService testService){
        this.name=name;
        this.order=order;
        this.testService=testService;
    }

    @Override
    public void run() {
        while(true){
            testService.test(name,order);
        }
    }

    public static void main(String[] args) {
        TestService testService=new TestService();
        new MyThreadA("A",0,testService).start();
        new MyThreadA("B",1,testService).start();
        new MyThreadA("C",2,testService).start();
    }
}
