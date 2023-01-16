package com.bootcoding.java.level_2assignments;

import java.util.Scanner;

public class BankNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = sc.nextInt();
         int total = amount / 100;
        System.out.println("There are :");
        System.out.println(total + " Note(s) of 100.00 " );
        amount = amount-(total * 100);
         total = amount /50;
        System.out.println(total + " Note(s) of 50.00 " );
        amount = amount-(total * 50);
        total = amount /20;
        System.out.println(total + " Note(s) of 20.00 ");
        amount = amount-(total * 20);
        total = amount /10;
        System.out.println(total + " Note(s) of 10.00 ");
        amount = amount-(total * 10);
        total = amount /5;
        System.out.println(total + " Note(s) of 5.00 ");
        amount = amount-(total * 5);
        total = amount /2;
        System.out.println(total + " Note(s) of 2.00 ");
        amount = amount-(total * 2);
        total = amount /1;
        System.out.println(total + " Note(s) of 1.00 ");
        amount = amount-(total * 1);

    }
}
