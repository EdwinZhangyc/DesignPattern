package com.zyc.Proxy.RemoteProxy;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuater();
    void turnCrank();
    void dispense();
}
