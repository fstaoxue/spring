package com.taoge.spring.service.impl;

import com.taoge.spring.bean.Stu;
import com.taoge.spring.service.RmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServiceImpl extends UnicastRemoteObject implements RmiService {

    public RmiServiceImpl() throws RemoteException {
        super();
    }

    public void test(Stu stu) throws RemoteException {
        System.out.println(stu.toString());
    }
}
