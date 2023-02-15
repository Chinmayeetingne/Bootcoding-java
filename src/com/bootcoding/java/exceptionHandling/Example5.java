package com.bootcoding.java.exceptionHandling;

public class Example5 {
    public static void main(String[] args) {
        try {
            int a[] = {2, 5, 7, 10, 12};
            for (int i = 0; i <= 5; i++) {
                System.out.println(a[i]);
            }
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
