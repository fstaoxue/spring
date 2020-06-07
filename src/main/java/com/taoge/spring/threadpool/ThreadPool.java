package com.taoge.spring.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreadPool {

    private ArrayBlockingQueue<Runnable> queue;

    private List<Worker> workerList;

    private int coreSize;

    private int queueSize;

    public ThreadPool(int coreSize,int queueSize){
        queue=new ArrayBlockingQueue<Runnable>(queueSize);
        workerList=new ArrayList<Worker>();
        for(int i=0;i<coreSize;i++){
            new Thread(new Worker(queue)).start();
        }
    }


    public void submit(Runnable runnable){
        queue.add(runnable);
    }


    private static class Worker implements Runnable{

        private ArrayBlockingQueue<Runnable> queue;

        public Worker(ArrayBlockingQueue<Runnable> queue){
            this.queue=queue;
        }

        public void run() {
            while(true){
                if(queue.size()>0){
                    Runnable runnable=queue.poll();
                    runnable.run();
                }
            }
        }
    }


    public static void main(String[] args) {
        ThreadPool pool=new ThreadPool(3,100);
        for(int i=0;i<100;i++){
            pool.submit(new MyTask(i+""));
        }
    }

}

class MyTask implements Runnable{

    private String name;

    public MyTask(String name){
        this.name=name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+name+"开始执行");
        try {
            Thread.sleep(new Random().nextInt(10)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--"+name+"执行完毕");
    }
}
