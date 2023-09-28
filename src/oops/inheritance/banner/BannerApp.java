package oops.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.matter="New batches of java is starting soon";
        fb.type="Flex Banner";
        fb.create();
        fb.print();

        //Constructor chaining
        //can you inherit constructor-No
    }
}
