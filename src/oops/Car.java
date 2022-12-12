package oops;

public class Car {
    String color;
    String model;
    String brandName;
    int lights;
    int seats;
    String fuelType;

    public void startEngine(){
        System.out.println("Engine is started");
    }

    public void stopEngine() {
        System.out.println("Engine is stopped");
    }

    public void move(){
        System.out.println("The car is moving");
    }

    public void print(){
        System.out.println("Car Color : " + color);
        System.out.println("Car Model : " + model);
        System.out.println("Car BrandName : " + brandName);
        System.out.println("Car Lights : " + lights);
        System.out.println("Car Seats : " + seats);
        System.out.println("Car FuelType: " + fuelType);

    }
}
