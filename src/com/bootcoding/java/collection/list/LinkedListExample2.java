package com.bootcoding.java.collection.list;

import oops.inheritance.exercise.Person;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Raja",22,2244332));
        list.add(new Person("Rani",32,3244332));
        list.add(new Person("Ramesh",42,1344332));
        list.add(new Person("Sonu",12,21244332));

        //traditional loop
//        for(int i=0;i< list.size();i++){
//            System.out.println(list.get(i));
//        }

        //for each loop
//        for (Person person: list) {
//            System.out.println(person);
//        }

        //for each method in java 8
        list.forEach(person -> System.out.println(person));
    }
}
