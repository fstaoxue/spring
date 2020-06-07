package com.taoge.spring.anno;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCC {

    public static void main(String[] args) {
        AtomicInteger integer=new AtomicInteger(0);
        Thread a=new Thread(new ThreadAA(integer));
        Thread b=new Thread(new ThreadBB(integer));
        a.start();
        b.start();
    }
}

class ThreadBB implements Runnable{

    private AtomicInteger integer;

    public ThreadBB(AtomicInteger integer){
        this.integer=integer;
    }

    @Override
    public void run() {
        while(true){
            int result = integer.get();
            if(result%2==0){
                System.out.println("BB-->"+result);
                integer.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


class ThreadAA implements Runnable{

    private AtomicInteger integer;

    public ThreadAA(AtomicInteger integer){
        this.integer=integer;
    }

    @Override
    public void run() {
        while(true){
            int result = integer.get();
            if(result%2==1){
                System.out.println("AA-->"+result);
                integer.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
