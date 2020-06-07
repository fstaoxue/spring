package com.taoge.spring.queue;

import java.util.Scanner;

public class CircleQueue<T> {

    private Object[] element;

    private int front;

    private int rear;

    private int maxSize;

    private static final int INIT_SIZE=16;

    public CircleQueue(){
        element=new Object[INIT_SIZE];
        front=0;
        rear=0;
        maxSize=INIT_SIZE;
    }

    public CircleQueue(int size){
        if(size<=0){
            throw new ArrayIndexOutOfBoundsException();
        }
        element=new Object[size];
        front=0;
        rear=0;
        maxSize=size;
    }

    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public void add(T ele){
        if(isFull()){
            System.out.println("队列已满。。。");
            return;
        }
        element[rear]=ele;
        rear=(rear+1)%maxSize;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("队列已空。。。");
        }
        T obj=(T)element[front];
        front=(front+1)%maxSize;
        return obj;
    }

    public int getCount(){
        return (rear+maxSize-front)%maxSize;
    }

    private void show(){
        if(isEmpty()){
            System.out.println("队列");
        }
        for(int i=front;i<front+getCount();i++){
            System.out.println(i%maxSize+"-->"+element[i%maxSize]);
        }
    }

    private void showAll(){
        for(int i=0;i<maxSize;i++){
            System.out.println(i+"-->"+element[i]);
        }
    }

    public static void main(String[] args) {
        CircleQueue<Integer> circleQueue=new CircleQueue<Integer>(4);
        Scanner scanner=new Scanner(System.in);
        System.out.println("a-->add元素");
        System.out.println("p-->pop元素");
        System.out.println("c-->count元素");
        System.out.println("s-->show元素");
        String operation;
        while((operation=scanner.nextLine())!=null){
            if(operation.equals("a")){
                System.out.println("请输入元素");
                int num=scanner.nextInt();
                circleQueue.add(num);
            }else if(operation.equals("p")){
                int num=circleQueue.pop();
                System.out.println(num);
            }else if(operation.equals("c")){
                int count=circleQueue.getCount();
                System.out.println(count);
            }else if(operation.equals("s")){
                circleQueue.show();
            }else if(operation.equals("ss")){
                circleQueue.showAll();
            }
        }
    }
}
