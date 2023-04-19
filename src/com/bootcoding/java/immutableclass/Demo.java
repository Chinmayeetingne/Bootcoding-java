package com.bootcoding.java.immutableclass;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rashi", "DAYPS288N", 20000000);
        Employee e2 = new Employee("Shruti", "AASDF5132W", 1000000);
        Employee e3= e1;
        System.out.println(e1);
    }
}
