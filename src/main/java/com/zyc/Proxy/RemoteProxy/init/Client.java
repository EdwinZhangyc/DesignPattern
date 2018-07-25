package com.zyc.Proxy.RemoteProxy.init;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main (String[] args){
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(myRemote.sayHello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}