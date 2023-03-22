package com.bootcoding.java.fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable
{
    private  String name;
    private int age;
    private long phone;
    Employee(String name, int age ,long phone){
        this.age=age;
        this.name=name;
        this.phone=phone;
    }
    public String toString(){
        return "Name:"+name+
                " Age : "+age+
                " Phone : "+phone;
    }
}
public class Demo7 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("info.txt");
            ObjectInputStream objIn = new ObjectInputStream(fin);
            Employee employee = (Employee) objIn.readObject();
            System.out.println(employee);
            objIn.close();
            fin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
