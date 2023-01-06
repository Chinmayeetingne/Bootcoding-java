package oops;

import java.util.concurrent.Callable;

public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1 = Cycle.createCycle();
        Cycle c2 = Cycle.createCycle(2, 2 ,"black","gearcycle" );
        Cycle.printCycle(c1);
        Cycle.printCycle(c2);
    }
}
