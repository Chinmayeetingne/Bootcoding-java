package oops;

import java.util.concurrent.Callable;

public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1 = Cycle.createCycle();
        Cycle c2 = Cycle.createCycle(2, 2 ,"black","gearcycle" );
        Cycle.printCycle(c1);
        Cycle.printCycle(c2);

        GearCycle gc = new GearCycle();
        gc.brakes = 2;
        gc.colour = "black";
        gc.type = "GearCycle";
        gc.tyres = 2;


        MountainCycle mc = new MountainCycle();
        mc.brakes = 2;
        mc.colour = "green";
        mc.type = "mountain cycle";
        mc.tyres = 2;



    }
}
