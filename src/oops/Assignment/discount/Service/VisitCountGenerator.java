package oops.Assignment.discount.Service;

import java.util.Random;

public class VisitCountGenerator {

    private final static int MAX = 1000;
    private final static int MIN = 1;
    private static Random random = new Random();
    public static int getVisitCount() {
        return MIN + random.nextInt(MAX - MIN);
    }
}
