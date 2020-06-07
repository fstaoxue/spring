package com.taoge.spring.data.bean;

public class Test<T> {

    private T e;

    private T a;

    public Test(T e){
        this.e=e;
    }

    public void seta(T a){
        this.a=a;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test t=new Test(11);
        t.seta("3");
        System.out.println(t);
    }
}
