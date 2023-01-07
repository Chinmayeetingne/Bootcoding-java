package oops.encapsulation;

import java.sql.SQLOutput;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance();
        ambulance.setHospitalName("New Era hospital");
        ambulance.setType("Van");
        ambulance.setCharges(2000.00);
        ambulance.setAvailable(true);

        System.out.println("Ambulance Info:");
        System.out.println("Hospital Name : "+ ambulance.getHospitalName());
        System.out.println("Type : "+ ambulance.getType());
        System.out.println("Charges : "+ ambulance.getCharges());
        System.out.println("Available : "+ambulance.isAvailable());


    }
}