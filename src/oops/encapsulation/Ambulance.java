package oops.encapsulation;

public class Ambulance {
    private String hospitalName;
    private String type;
    private double charges;
    private boolean isAvailable;

    //use get methods and set methods
    //to assign value - use setter
    //to get value - use getter


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
