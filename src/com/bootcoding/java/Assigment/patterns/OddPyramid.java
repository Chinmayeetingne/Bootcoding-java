package com.bootcoding.java.Assigment.patterns;

public class OddPyramid {
    public static void main(String[] args) {
        int k=1, n =4, num= 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( k=1;k<=i;k++){
                System.out.print(num + " ") ;
                num= num +2;

            }
            System.out.println() ;
        }

    }
}
