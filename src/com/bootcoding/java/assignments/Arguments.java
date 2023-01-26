package com.bootcoding.java.assignments;

public class Arguments {
    public static void main (String [] args)
    {
        probability(0.2 , 50 , 9);
    }

    public static void probability(double x, int y, int z)
    {
        if(x * y >z){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
