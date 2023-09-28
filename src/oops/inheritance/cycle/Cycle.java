package oops.inheritance.cycle;

public class Cycle {
    int tyres;
    int brakes;
    String colour;
    String type;

    public static Cycle createCycle(){
        Cycle cycle = new Cycle();
       cycle.brakes = 2;
       cycle.tyres = 2;
       cycle.colour = "red";
       cycle.type = "hybrid";
       return  cycle;

    }
    public static  Cycle createCycle(int tyres, int brakes, String colour, String type){
        Cycle cycle = new Cycle();
        cycle.tyres = tyres;
        cycle.brakes = brakes;
        cycle.colour = colour;
        cycle.type = type;
        return cycle;

    }
    public  static  void printCycle(Cycle cycle){
        System.out.println("Cycle consists of  tyres = " + cycle.tyres);
        System.out.println("Cycle consists of brakes = " + cycle.brakes);
        System.out.println("Cycle consists of colour  = " + cycle.colour);
        System.out.println("Cycle consists of type = " + cycle.type);
    }
}
