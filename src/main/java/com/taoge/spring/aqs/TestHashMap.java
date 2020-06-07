package com.taoge.spring.aqs;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.util.*;

public class TestHashMap {

//    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(test());
//        File file=new File("D:\\1.txt");
//        FileInputStream in=new FileInputStream(file);
//        Channel channel=in.getChannel();
//        ByteBuffer buffer=ByteBuffer.allocate(1024);
//
//    }


    public static void main(String[] args) {
        test4();
    }

    public static int test(){
        int a=5;
        try{
            return a;
        }finally {
            a--;
            System.out.println("ss"+a);
            return 1;
        }
    }

    public static int test2(){
        ClassPathResource classPathResource=new ClassPathResource("spring.xml");
        return 0;
    }

    public static void test3(){
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1,"20");
        map.put(2,"30");
        System.out.println(map);

    }


    public static void test4(){
        int a=360;
        byte b=(byte)a;
        System.out.println(b);
    }

    public static void test5(){
        System.out.println(Integer.SIZE);
    }
}
