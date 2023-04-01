package com.bootcoding.java.collection.map;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyLaptop1 {
        public static void main(String[] args) {
            List<Laptop1> list = new ArrayList<>();
            list.add(new Laptop1("Macbook", 32,12000));
            list.add(new Laptop1("Dell", 8,1100));
            list.add(new Laptop1("Lenovo", 4,1000));
            list.add(new Laptop1("Asus", 16,3000));


            for(Laptop1 laptop1:list){
                System.out.println(laptop1);
            }
            Comparator<Laptop1> comparator = new Comparator<Laptop1>() {
                @Override
                public int compare(Laptop1 lap1, Laptop1 lap2) {
                   if(lap1.getRam()>lap2.getRam()){
                       return 1;
                   }else{
                       return -1;
                   }
                }
            };
            Collections.sort(list,comparator);

            for(Laptop1 laptop1:list){
                System.out.println(laptop1);
            }
        }
}
