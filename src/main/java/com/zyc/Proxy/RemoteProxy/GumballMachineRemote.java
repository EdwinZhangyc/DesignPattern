package com.zyc.Proxy.RemoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    //返回的类型必须被序列化
    public State getState() throws RemoteException;
}
