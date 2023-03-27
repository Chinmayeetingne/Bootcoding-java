package com.bootcoding.java.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<String>();
        stringSet.add("Rashi");
        stringSet.add("Manish");
        stringSet.add("Shruti");
        stringSet.add("Rashi");
        stringSet.add("Rashi");

        stringSet.forEach(s -> System.out.println(s));
    }
}
