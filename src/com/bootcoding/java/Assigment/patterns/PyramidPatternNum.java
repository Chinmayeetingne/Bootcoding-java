package com.bootcoding.java.Assigment.patterns;

public class PyramidPatternNum {
    public static void pyramidPattern(int n) {
        int k =1;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        pyramidPattern(n);
    }
}
