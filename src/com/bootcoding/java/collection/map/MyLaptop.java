package com.bootcoding.java.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Macbook", 32,12000));
        list.add(new Laptop("Dell", 8,1100));
        list.add(new Laptop("Lenovo", 4,1000));
        list.add(new Laptop("Asus", 16,3000));

        Collections.sort(list);

        for(Laptop laptop:list){
            System.out.println(laptop);
        }
    }
}
