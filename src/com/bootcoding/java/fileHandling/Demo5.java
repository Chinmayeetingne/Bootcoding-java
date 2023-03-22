package com.bootcoding.java.fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo5 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("sample.doc");
            ObjectInputStream objIn = new ObjectInputStream(fin);
            String msg = (String)objIn.readObject();
            System.out.println(msg);
            objIn.close();
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
