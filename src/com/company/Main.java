package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        YArrayList myArrayList = new YArrayList();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(13);
        myArrayList.add(14);
        myArrayList.add(15);
        myArrayList.add(16);
        myArrayList.add(17);
        myArrayList.add(18);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        myArrayList.delete(16);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(3));
    }
}
