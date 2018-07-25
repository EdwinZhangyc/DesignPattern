package com.zyc.Proxy.RemoteProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class TestMain {

    public static void main(String[] args) throws RemoteException {

        GumballMachine gumballMachine = null;
        int count = 0;
        if(args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        //注册服务
        try{
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}