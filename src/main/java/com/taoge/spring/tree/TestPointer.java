package com.taoge.spring.tree;

import java.util.ArrayList;
import java.util.List;

public class TestPointer {

    public static void ll(List<String> ll){
        ll=new ArrayList<>();
        ll.add("taoge");
        System.out.println(ll.toString());
    }

    public static void main(String[] args) {
        List<String> tet=new ArrayList<>();
        tet.add("1");
        System.out.println(tet.toString());
        ll(tet);
        System.out.println(tet.toString());
    }
}
