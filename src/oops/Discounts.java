package oops;

public class Discounts {
    public static void main(String args[]) {
        int[] frequOfShopping = {10, 5, 7, 3, 0, 9};
        String[] discountLists = calculateDiscountList(frequOfShopping);
        for (int i = 0; i < discountLists.length; i++) {
            System.out.println("no of shoppings = " + frequOfShopping[i] + " -> " + discountLists[i] + " discounts ");
        }
    }

    public static String[] calculateDiscountList(int[] frequOfShopping) {

        String[] discounts = new String[frequOfShopping.length];
        for (int i = 0; i < frequOfShopping.length; i++) {

           String discount;
            discount = getDiscount(frequOfShopping[i]);
            discounts[i] = discount;

        }
        return discounts;
    }
// array as input and return output as array only.
    private static String getDiscount(int frequOfShopping) {
        String discount;
        if (frequOfShopping >= 8) {
            discount = "50%" ;
        } else if (frequOfShopping >= 5) {
            discount = "30%" ;
        } else {
            discount = "10%" ;
        }
        return discount;
    }
}
