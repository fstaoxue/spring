package com.taoge.spring.bean;

public class TestService {

    private volatile static int count=0;


    public synchronized void test(String name,int order) {
        while(count%3!=order){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name);
        count++;
        this.notifyAll();

    }


}
