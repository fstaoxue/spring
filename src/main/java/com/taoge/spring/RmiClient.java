package com.taoge.spring;

import com.taoge.spring.bean.Stu;
import com.taoge.spring.service.RmiService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class RmiClient {

    public static void main(String[] args) {
        try {
            RmiService rmiService = (RmiService) Naming.lookup("//127.0.0.1:8080/wbh");//获取远程对象
            Stu user = new Stu();
            user.setName("james");
            user.setAge(15);
            rmiService.test(user);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
