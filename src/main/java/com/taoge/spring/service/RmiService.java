package com.taoge.spring.service;

import com.taoge.spring.bean.Stu;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiService extends Remote {

    void test(Stu stu) throws RemoteException;

}
