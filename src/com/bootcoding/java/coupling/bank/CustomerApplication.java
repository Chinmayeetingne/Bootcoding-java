package com.bootcoding.java.coupling.bank;

public class CustomerApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.name="Rashi";
        bankAccount.accountId=32649596;
        bankAccount.balance=50000.0;

        Customer customer=new Customer();
        customer.name="Rashi";
        customer.city="Nagpur";
        customer.emailId="rashitingne12@gmail.com";
        customer.phone=9552422909L;
        customer.bankAccount= bankAccount;

        System.out.println("Customer name:"+customer.name);
        System.out.println("Customer city:"+customer.city);
        System.out.println("Customer phone:"+customer.phone);
        System.out.println("Customer emailId:"+customer.emailId);
        System.out.println("Customer's BankAccount name:"+customer.bankAccount.name);
        System.out.println("Customer's BankAccount accountId:"+customer.bankAccount.accountId);
        System.out.println("Customer's BankAccount balance:"+customer.bankAccount.balance);
    }
}
