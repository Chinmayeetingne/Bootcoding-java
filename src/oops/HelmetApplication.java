package oops;

public class HelmetApplication {
    public static void main(String[] args) {
        Helmet h1 = Helmet.createHelmet();
        Helmet h2 = Helmet.createHelmet("halfface", "red", 800);
        Helmet.pintHelmet(h1);
        Helmet.pintHelmet(h2);
    }
}
