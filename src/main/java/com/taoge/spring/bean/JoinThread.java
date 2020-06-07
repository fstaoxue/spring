package com.taoge.spring.bean;

public class JoinThread extends Thread {

    private String name;

    public JoinThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            JoinThread thread=new JoinThread(i+"");
            thread.start();
            thread.join();
        }
    }
}
