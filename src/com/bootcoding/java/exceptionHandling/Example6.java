package com.bootcoding.java.exceptionHandling;

public class Example6 {
    public static void main(String[] args) {
        try{
            int a = 10, b = 0,c;
            c = a/b;
            System.out.println("Value =" + c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am in finally block");
        }
        System.out.println("The end");
    }
}
