package com.taoge.spring.tree;

public class PrintOrder extends Thread {

    private int value;

    public PrintOrder(int value){
        this.value=value;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){
            Thread temp=new PrintOrder(i);
            temp.join();
            temp.start();
        }
    }
}
