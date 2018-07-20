package com.zyc.Iterator;

public class TestMain {

    public static void main(String[] args){

        Menu dinnerMenu = new DinnerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}