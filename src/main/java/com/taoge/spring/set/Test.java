package com.taoge.spring.set;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        Test.t();
        Test.tt();
    }

    public static void t(){
        double a=1.0;
        double b=0.42;
        System.out.println(a-b);
    }

    public static strictfp void tt(){
        double a=1.0;
        double b=0.42;
        System.out.println(a-b);
    }
}
