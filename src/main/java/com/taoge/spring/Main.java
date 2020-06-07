package com.taoge.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.taoge.spring.bean.MyCallable;
import com.taoge.spring.bean.Stu;
import com.taoge.spring.service.RedisService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-redis.xml");
//        //RedisService redisService=applicationContext.getBean(RedisService.class);
//        //redisService.setString("test_redis",Integer.toString(new Random().nextInt(1000)));
//        //System.out.println(redisService.getString("test_redis"));
//        Stu stu=(Stu)applicationContext.getBean("My");
//        System.out.println(stu.hashCode());
//    }

//    public static void main(String[] args) {
//        try {
//            System.out.println(System.currentTimeMillis()/1000);
//            ExecutorService executorService= Executors.newFixedThreadPool(10);
//            List<Future<String>> result=new ArrayList<Future<String>>();
//            for(int i=0;i<10;i++){
//                result.add(executorService.submit(new MyCallable()));
//            }
//            boolean isNotComplete=true;
//            while(isNotComplete){
//                isNotComplete=false;
//                for(Future<String> temp:result){
//                    if(!temp.isDone()){
//                        isNotComplete=true;
//                    }
//                }
//            }
//            for(Future<String> temp:result){
//                System.out.println(temp.get());
//            }
//            System.out.println(System.currentTimeMillis()/1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
////        FutureTask<String> task=new FutureTask<String>(new MyCallable());
////        new Thread(task).start();
//        System.out.println("kk".hashCode());
//    }

//    public static void main(String[] args) {
//        String patternNumber="^\\d+(\\.\\d+)?";
//        String patternDate="^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
//        System.out.println("12.06".matches(patternNumber));
//        System.out.println("srd".matches(patternNumber));
//        System.out.println("2019-12-09 12:09:99".matches(patternDate));
//    }

//    public static void main(String[] args) {
//        String a=new String("123");
//        String b="123";
//        System.out.println(a==b);
//
//        System.out.println(a==b);
//        System.out.println(a.intern()==b);
//    }


//    public static void main(String[] args) {
//        double a=0.05;
//        double b=0.01;
//        System.out.println(a+b);
//        BigDecimal c=new BigDecimal(a+"");
//        BigDecimal d=new BigDecimal(b+"");
//        System.out.println(        c.add(d));
//    }


    public static void main(String[] args) {
//        String data = "[{\"appName\":\"Conferendo\",\"appType\":\"即时聊天\",\"startTime\":1584861156,\"endTime\":1584951156,\"total\":5},{\"appName\":\"QQ\",\"appType\":\"即时聊天\",\"startTime\":1584964240,\"endTime\":1584964240,\"total\":2}]";
//        JSONArray array = JSON.parseArray(data);
//        System.out.println(array.size());

    }






}
