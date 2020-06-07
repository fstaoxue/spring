package com.taoge.spring.aqs;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolExecutor {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            executorService.execute(new PoolTest());
        }
    }
}

class PoolTest implements Runnable{

    @Override
    public void run() {
        Random random=new Random();
        int temp=random.nextInt(10);
        try {
            Thread.sleep(temp*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(random.nextInt(temp));
    }
}
