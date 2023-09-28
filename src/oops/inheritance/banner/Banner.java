package oops.inheritance.banner;

import java.lang.ref.SoftReference;

public class Banner {
    String matter;
    String type;

     Banner(){
         System.out.println("Banner object is created!");
     }
    public static void create(){
        System.out.println("Banner has been created");
    }

    public static void  print(){
        System.out.println("Banner has been printed");
    }


}
