package com.taoge.spring.stack;

import java.util.Arrays;

public class ArrayStack {

    private String[] element;

    private int top;

    private int count;

    private int maxSize;

    private static final int INIT_CAPACITY=10;

    public ArrayStack(){
        element=new String[INIT_CAPACITY];
        maxSize=INIT_CAPACITY;
        top=-1;
    }

    public ArrayStack(int size) {
        element=new String[size];
        maxSize=size;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public void push(String data){
        if(isFull()){
            System.out.println("栈已满。。。。");
        }
        element[++top]=data;
        count++;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("栈已空。。。");
        }
        String data=element[top];
        element[top]=null;
        count--;
        top--;
        return data;
    }

    public String top(){
        if(isEmpty()){
            System.out.println("栈已空。。。");
        }
        return element[top];
    }

    public int size(){
        return count;
    }

    public void show(){
        if(isEmpty()){
            System.out.println("队列为空。。。");
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<size();i++){
            builder.append("[");
            builder.append(element[i]);
            builder.append("]");
            builder.append(",");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack();
        stack.push("1");
        stack.show();
        stack.push("2");
        stack.show();
        stack.push("3");
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        stack.push("5");
        stack.show();
    }

}
