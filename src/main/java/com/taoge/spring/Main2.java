package com.taoge.spring;


import java.util.ArrayList;
import java.util.List;

public class Main2 {

//    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.println(calculateSize(i));
//        }
//
//        System.out.println(Integer.MAX_VALUE);
//    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(5);
        list.add("1");
        list.add("2");
        list.add("3");
        char a='a';
        char b='a';
        System.out.println(a==b);
    }

    private static int calculateSize(int numElements) {
        int initialCapacity = 8;
        // Find the best power of two to hold elements.
        // Tests "<=" because arrays aren't kept full.
        if (numElements >= initialCapacity) {
            initialCapacity = numElements;
            initialCapacity |= (initialCapacity >>>  1);
            initialCapacity |= (initialCapacity >>>  2);
            initialCapacity |= (initialCapacity >>>  4);
            initialCapacity |= (initialCapacity >>>  8);
            initialCapacity |= (initialCapacity >>> 16);
            initialCapacity++;

            if (initialCapacity < 0)   // Too many elements, must back off
                initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements
        }
        return initialCapacity;
    }

}
