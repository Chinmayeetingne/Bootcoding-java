package com.bootcoding.java.fileHandling;


class Person
{
    private  String name;
    private int age;
    private long phone;
    Person(String name, int age ,long phone){
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
public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person("rashi" ,21, 995498593L);
        String str = new String("Rashi");
        System.out.println(person);
        System.out.println(str);
    }
}
