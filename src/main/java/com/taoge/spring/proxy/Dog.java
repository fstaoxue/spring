package com.taoge.spring.proxy;

public class Dog extends Animal {

    public int eat(int i){
        System.out.println("dog eat "+i+"  顿饭");
        return 10;
    }
}
