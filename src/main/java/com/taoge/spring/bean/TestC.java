package com.taoge.spring.bean;

import java.util.ArrayList;
import java.util.List;

public class TestC {

    public byte[] bytes=new byte[1024];

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        List<TestC> list=new ArrayList<TestC>();
        while(true){
            Thread.sleep(10);
            list.add(new TestC());
            System.out.println(list.size());
        }
    }
}
