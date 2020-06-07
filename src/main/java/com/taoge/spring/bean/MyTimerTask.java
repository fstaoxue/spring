package com.taoge.spring.bean;

import java.util.Random;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+new Random().nextInt(1000));
    }
}
