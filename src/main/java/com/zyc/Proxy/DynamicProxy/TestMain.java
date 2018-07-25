package com.zyc.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class TestMain {

    public static void main (String[] args){

        TestMain testMain = new TestMain();
        testMain.test();
    }

    PersonBean getOwnerProxy(PersonBean personBean){

        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    PersonBean getNoOwnerProxy(PersonBean personBean){

        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NoOwnerInvocationHandler(personBean));
    }

    private void initializaDatabase() {

    }
    private void test() {

        PersonBean ownerProxy = getOwnerProxy(new PersonBeanImpl());
        PersonBean noOwnerProxy = getNoOwnerProxy(new PersonBeanImpl());

    }



}
