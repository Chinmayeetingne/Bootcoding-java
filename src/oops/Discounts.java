package oops;

public class Discounts {
    public static void main(String args[]) {
        int[] frequOfShopping = {10, 5, 7, 3, 0, 9};
        String[] discountLists = calculateDiscountList(frequOfShopping);
        for (int i = 0; i < discountLists.length; i++) {
            System.out.println(frequOfShopping[i] + " -> " + discountLists[i]);
        }
    }

    public static String[] calculateDiscountList(int[] frequOfShopping) {

        String[] discounts = new String[frequOfShopping.length];
        for (int i = 0; i < frequOfShopping.length; i++) {

           String discount;
            int percentage = frequOfShopping[i];
            discount = getDiscount(percentage);
            discounts[i] = discount;

        }
        return discounts;
    }

    private static String getDiscount(int frequOfShopping) {
        String discount;
        if (frequOfShopping > 10) {
            discount = "50%" ;
        } else if (frequOfShopping > 7) {
            discount = "30%" ;
        } else {
            discount = "20%" ;
        }
        return discount;
    }
}
