package oops.inheritance.exercise;

public class Marker {

    // data member -  instance variable
   public String type;
   public String brand;
   public  String color;
     public double price;

    //member method
   //Access specifier
    //private, public, protected, <default>

    public  void refill () {
        System.out.println("Refill marker successfully");
    }

    public void write(String message){
        System.out.println("On white board - " + message);
    }
    public void print(){
        System.out.println("Marker Brand : " + brand);
        System.out.println("Marker Type : " + type);
        System.out.println("Marker Color : " + color);
        System.out.println("Marker Price : " + price);
    }

//types of comments
    // single line comment
    /*
    multiline commments
    black comments
    fjhvfu
    sbfjberfe
      */

    /**
     documentation comments
     */

}
