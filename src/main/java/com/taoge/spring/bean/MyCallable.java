package com.taoge.spring.bean;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Random random=new Random();
//        Thread.sleep(random.nextInt(10)*1000);
        Thread.sleep(5000);
        return random.nextInt(100)+"";
    }
}
