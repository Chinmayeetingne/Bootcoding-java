package com.bootcoding.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Person> personSet= new HashSet<Person>();
        personSet.add(new Person("Roshan" ,22,587431649));
        personSet.add(new Person("Ritesh" ,22,587431649));
        personSet.add(new Person("Roshan" ,22,587431649));
        personSet.add(new Person("Manish" ,22,587431649));
        personSet.add(new Person("Rashi" ,22,587431649));
        personSet.add(new Person("Raj" ,22,587431649));
        personSet.add(new Person("Rajesh" ,22,587431649));

        for (Person p: personSet) {
            System.out.println(p);
        }
    }
}
