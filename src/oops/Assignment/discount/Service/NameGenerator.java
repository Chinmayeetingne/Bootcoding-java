package oops.Assignment.discount.Service;

import java.util.Random;

public class NameGenerator {

    private static String [] CUSTOMER_NAMES =
            {"Rashi" , "Shruti" , "Abhishek", "Yash", "Chinmayee", "Om", "Sakshi"};
    private static final Random random = new Random();

    public static String getName() {
       int randomIndex = random.nextInt(CUSTOMER_NAMES.length);
       return CUSTOMER_NAMES[randomIndex];
    }
}
