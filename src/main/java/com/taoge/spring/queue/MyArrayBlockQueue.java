package com.taoge.spring.queue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyArrayBlockQueue {


    private Object[] data;

    private Lock lock=new ReentrantLock();

    private Condition isEmpty=lock.newCondition();

    private Condition isFull=lock.newCondition();

    public MyArrayBlockQueue(int size){
        data=new Object[size];
    }

    public void add(Object data){
    }

}
