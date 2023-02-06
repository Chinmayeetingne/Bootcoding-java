package oops.inheritance;

abstract class Sim {
    abstract void inserted();
}
class Idea extends Sim {
    void inserted(){
        System.out.println("Idea sim inserted");
    }
}

class Airtel extends Sim{
    void inserted(){
        System.out.println("Airtel sim inserted");
    }
}

class Jio extends Sim{
    void inserted(){
        System.out.println("Jio sim inserted");
    }
}

class Magic{
    public void showMagic(Sim sim){
        System.out.println("Start");
        sim.inserted();
        System.out.println("End");
    }
}
class Demo{
    public static void main(String[] args) {
        Magic m =new Magic();
        Idea idea = new Idea();
        Airtel airtel = new Airtel();
        Jio jio = new Jio();
        m.showMagic(idea);
        m.showMagic(airtel);
        m.showMagic(jio);
    }
}

