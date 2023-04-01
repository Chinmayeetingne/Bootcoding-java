package com.bootcoding.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<Integer,String>();
        map.put(1,"Ashok");
        map.put(2,"Nishant");
        map.put(3,"Rashi");
        map.put(4,"Sharayu");
        map.put(5,"Aman");
        map.put(6,"Arav");

        //Traversing map
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+ "."+ m.getValue());
        }
    }
}
