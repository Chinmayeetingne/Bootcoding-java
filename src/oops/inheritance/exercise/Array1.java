package oops.inheritance.exercise;

public class Array1 {

    public static boolean isSeniorCitizen(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 60) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAdult(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKid(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 10)
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        int [] ages = {12, 15, 25,26,27, 30};
              System.out.println(isSeniorCitizen(ages));
        System.out.println(isAdult(ages));
        System.out.println(isKid(ages));
    }
}
