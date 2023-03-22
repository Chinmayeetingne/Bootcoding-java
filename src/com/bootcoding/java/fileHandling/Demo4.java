package com.bootcoding.java.fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo4 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("sample.doc");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            String msg = "hello world !! spring here";
            objOut.writeObject(msg);
            objOut.close();
            fout.close();
            System.out.println("Info stored successfully");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
