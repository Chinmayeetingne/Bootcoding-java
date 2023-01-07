package oops.Assignment.discount.Service;

import java.util.Random;

public class OrderCountGenerator {

    private final static int MAX = 1000;
    private final static int MIN = 1;
    private static Random random = new Random();
    public static int getOrderCount() {
       return MIN + random.nextInt(MAX - MIN);
    }
}
