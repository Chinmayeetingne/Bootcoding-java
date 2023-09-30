package oops.inheritance.exercise;

public class DusterApplication {
    public static void main(String[] args) {
        Duster d1 = Duster.createDuster();
        Duster d2 = Duster.createDuster(2.5, 1.5, 3.5, "rectangular");
        Duster.printDuster(d1);
        Duster.printDuster(d2);

    }
}
