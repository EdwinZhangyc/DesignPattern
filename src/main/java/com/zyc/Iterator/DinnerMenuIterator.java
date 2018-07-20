package com.zyc.Iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItem){
        this.menuItems = menuItem;
    }

    @Override
    public boolean hasNext() {

        if (this.position >= menuItems.length || menuItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = this.menuItems[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {

        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until ");
        }
        if (menuItems[position - 1] != null){
            for (int i = 0; i < menuItems.length -1 ; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }

    public static void main (String[] args){
        DinnerMenuIterator dinnerMenuIterator = new DinnerMenuIterator(null);
        dinnerMenuIterator.remove();
    }
}