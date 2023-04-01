package com.bootcoding.java.collection.map;


import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<Integer,String>();
           map.put(101,"Rashi");
           map.put(102,"Ravi");
           map.put(103,"Raja");
           map.put(104,"Shruti");
        System.out.println(map);

        }
}

