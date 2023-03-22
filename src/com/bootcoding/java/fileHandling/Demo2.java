package com.bootcoding.java.fileHandling;

import java.io.FileOutputStream;

public class Demo2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("sample.txt");
            String msg = "hello world !! java here";
            byte b[] = msg.getBytes();
            fout.write(b);
            System.out.println("Info stored successfully");
            fout.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
