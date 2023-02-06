package oops.inheritance;

 interface Sim1{
    void inserted();
}

class Vodafone implements Sim1{
     public void inserted(){
         System.out.println("vodafone sim inserted");
     }
}
class Demo2{
    public static void main(String[] args) {
        Vodafone vodafone = new Vodafone();
        vodafone.inserted();
    }
}

