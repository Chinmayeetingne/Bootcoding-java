package com.bootcoding.java.Assigment.patterns;

public class PatternNums {
    public static void main(String[] args) {
        int  k = 1, n = 0;
        for(int i=0;i<=4;i++)
        {
            for(int j=1; j<i+1;j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
