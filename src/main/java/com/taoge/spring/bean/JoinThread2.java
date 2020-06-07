package com.taoge.spring.bean;

public class JoinThread2 extends Thread {

    private String name;

    private Thread thread;

    public JoinThread2(String name,Thread previous){
        this.name=name;
        this.thread=previous;
    }

    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        Thread previous=Thread.currentThread();
        for(int i=0;i<10;i++){
            JoinThread2 thread2=new JoinThread2(i+"",previous);
            thread2.start();
            previous=thread2;
        }
        System.out.println("hello");
    }
}
