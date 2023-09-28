package oops.inheritance.box;

public class Box {
   //data members
    double length;
    double height;
    double breadth;

    //member methods
    public static Box createBox(){
        Box box = new Box();
        box.length = 10.0;
        box.breadth= 10.0;
        box.height = 10.0;
        return box;
    }

    public static Box createBox(double l, double h ,double b){
        Box box = new Box();
        box.length = l;
        box.breadth= b ;
        box.height = h ;
        return box;
    }
    public static void printBox(Box box){
        System.out.println("Box length =" + box.length);
        System.out.println("Box  breadth =" + box.breadth);
        System.out.println("Box height =" + box.height);
    }
}
