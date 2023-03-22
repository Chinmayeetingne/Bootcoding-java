package com.bootcoding.java.fileHandling;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable
{
    private  String name;
    private int age;
    private long phone;
    Person1(String name, int age ,long phone){
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

public class Demo6 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("info.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            Person1 person1 = new Person1("chinnmayee" ,20 ,9378474334L);
            objOut.writeObject(person1);
            objOut.close();
            fout.close();
            System.out.println("info store successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
        }
}

