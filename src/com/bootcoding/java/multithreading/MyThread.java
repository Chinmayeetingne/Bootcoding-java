package com.bootcoding.java.multithreading;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Rashi");
        t.start();
    }
    public void run(){
        System.out.println("Hello");
    }
}
public class MyThread {
    public static void main(String[] args) {
        NewThread N1= new NewThread();
        NewThread N2= new NewThread();
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            }
    }
}
