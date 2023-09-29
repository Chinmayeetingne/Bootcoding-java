package oops.inheritance.exercise;

public class Duster {
    String shape;
    double breadth;
    double length;
    double height;
    String size;


    public static  Duster createDuster(){
        Duster duster = new Duster();
        duster.length = 10.0;
        duster.height = 10.0;
        duster.breadth = 10.0;
        duster.shape = "rectangular";
        return duster;
    }
    public static Duster createDuster(double l, double h, double b, String s ){
        Duster duster = new Duster();
        duster.length = l;
        duster.height = h;
        duster.breadth = b;
        duster.shape = s;
        return duster;
    }
    public static void printDuster(Duster duster){
        System.out.println("Duster length = " + duster.length);
        System.out.println("Duster height= " + duster.height);
        System.out.println("Duster breadth = " + duster.breadth);
        System.out.println("Duster shape = " + duster.shape);
    }

}
