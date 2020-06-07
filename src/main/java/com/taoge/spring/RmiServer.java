package com.taoge.spring;

import com.taoge.spring.service.RmiService;
import com.taoge.spring.service.impl.RmiServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {

    public static void main(String[] args) {

        try {
            AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext("com.taoge.spring");
            // 创建一个远程对象，同时也会创建stub对象、skeleton对象
            RmiService hello = new RmiServiceImpl();
            //启动注册服务
            Registry registry = LocateRegistry.createRegistry(8080);
            try {
                //将stub引用绑定到服务地址
                registry.bind("//127.0.0.1:8080/wbh", hello);
            }  catch (AlreadyBoundException e) {
                e.printStackTrace();
            }
            System.out.println("service bind already!!");

        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
