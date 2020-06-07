package com.taoge.spring.hashtable;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<String>[] hh=new LinkedList[10];
    public void add(){
        hh[0]=new LinkedList<String>();
    }

}
