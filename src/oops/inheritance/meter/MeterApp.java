package oops.inheritance.meter;

public class MeterApp {
    public static void main(String[] args) {
        SinglePhaseMeter sp = new SinglePhaseMeter();
        sp.voltage=240.00;
        sp.type="Single phase meter";
        sp.create();
        sp.display();
    }
}
