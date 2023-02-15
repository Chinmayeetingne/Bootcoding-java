package com.bootcoding.java.exceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        try{
            int a = 10, b = 2,c;
            c = a/b;
            System.out.println("Value =" + c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am in finally block");
        }
        System.out.println("The end");
    }
}
