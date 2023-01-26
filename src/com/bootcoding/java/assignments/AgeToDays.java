package com.bootcoding.java.assignments;

public class AgeToDays {

    public static void main(String args[])
    {
        int n= 21;
        System.out.println("Age in days: " +ageCalculator(n));

    }

    public static int ageCalculator(int n)
    {
        int i=0;
        i = n * 365;
        return i;

    }

}
