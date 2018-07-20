package com.zyc.Iterator;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator iterator1 = pancakeHouseMenu.createIterator();
        Iterator iterator2 = dinnerMenu.createIterator();
        System.out.println();
        printMenu(iterator1);
        System.out.println("-------------------------------");
        printMenu(iterator2);
    }

    private void printMenu(Iterator iterator) {

        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.isVegetarian());
        }
    }
}