package keywords;

import oops.inheritance.exercise.Marker;

public class FinalKeyword {
    public static void main(String[] args) {
        /*
        *final keyword is used to create constant variable.
        * final variable can  not be modified once it is initialized
         */

        final int a = 10;
       // a = 20;//re-assign another value //not allowed
       // a = 30;//changing value of a again//not allowed
        final double PI = 3.14;

        //final keyword to object (refernce variable)

        final Marker blueMarker = new Marker();

        //blueMarker = new Marker();//not allowed
        //It is allowed to change property of an object
        blueMarker.color= "Blue";//allowed
        blueMarker.color="RED";//allowed

    }
}
