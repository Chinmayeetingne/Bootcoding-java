package com.bootcoding.java.immutableclass;

final public class Employee {
    final private String name;
    final private String panNumber;
    final private double Salary;

    public Employee(String name, String panNumber, double salary) {
        this.name = name;
        this.panNumber = panNumber;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public double getSalary() {
        return Salary;
    }
}
