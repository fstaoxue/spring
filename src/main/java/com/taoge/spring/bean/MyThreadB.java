package com.taoge.spring.bean;

public class MyThreadB extends Thread{

    @Override
    public void run() {
        System.out.println(this.getState());
        System.out.println("hello");
    }


    public static void main(String[] args) throws InterruptedException {
        MyThreadB threadB=new MyThreadB();
        System.out.println(threadB.getState());
        threadB.start();
        threadB.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {

            }
        });
        MyThreadB.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {

            }
        });
        System.out.println(threadB.getState());
        threadB.join();
        System.out.println(threadB.getState());

    }
}
