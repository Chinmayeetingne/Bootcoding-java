package oops.inheritance.exercise;

public class Helmet {
    String type;
    String color;
    double price;

    public static Helmet createHelmet(){
        Helmet helmet = new Helmet();
        helmet.type = "fullface";
        helmet.color = "black";
        helmet.price = 700;
        return helmet;
    }
    public static Helmet createHelmet(String type, String color, double price){
        Helmet helmet = new Helmet();
        helmet.type = type;
        helmet.color = color;
        helmet.price = price;
        return helmet;
    }
    public static void pintHelmet(Helmet helmet){
        System.out.println("Helmet type = " + helmet.type );
        System.out.println("Helmet color  = " + helmet.color );
        System.out.println("Helmet price = " + helmet.price );
    }
}
