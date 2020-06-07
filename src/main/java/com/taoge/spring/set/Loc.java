package com.taoge.spring.set;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loc implements Comparable<Loc>{

    private String name;

    private int age;

    public Loc(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Loc o) {
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer>[] list=new ArrayList[10];
        list[0]=new ArrayList(Arrays.asList(new String[]{"hello"}));
        System.out.println(list[0].get(0));
        System.out.println(list[0].get(1));
    }
}
