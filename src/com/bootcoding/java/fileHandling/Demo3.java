package com.bootcoding.java.fileHandling;

import java.io.FileInputStream;

public class Demo3 {
    public static void main(String[] args) {
        try{
            int ch;
            FileInputStream fin = new FileInputStream("sample.txt");
            while((ch = fin.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
