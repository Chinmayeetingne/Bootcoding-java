package oops;

public class Application {
    public static void main(String[] args) {
        //syntax of object creation
        // ClassName objectName = new ClassName();

        Marker marker = new Marker();

        //Access members of an object

        //objectName.memberName -- data members
        marker.brand = "Camlin";
        marker.type = "WhiteBoardMarker";
        marker.color = "BLUE";
        marker.price = 142.89;
        //objectName.memberMethod()
        marker.refill();
        marker.write("I am learning OOPs in java");
        marker.print();

        Car car = new Car();
        car.color = "Black";
        car.model = "suv";
        car.brandName = "Range Rover";
        car.lights = 4;
        car.seats = 6+1;
        car.fuelType = "Disel";

        car.startEngine();
        car.stopEngine();
        car.move();

    }


}
