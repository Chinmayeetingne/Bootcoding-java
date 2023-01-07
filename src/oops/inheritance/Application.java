package oops.inheritance;

public class Application {

    public static void main(String[] args) {
        ComputerTable ct = new ComputerTable();
        ct.legs = 4;
        ct.tableTop= true;
        ct.material = new Material();
        ct.tableType = "Computer";
        ct.createTable();
        ct.move();

        DiningTable dt = new DiningTable();
        dt.legs = 4;
        dt.tableTop = true;
        dt.material = new Material();
        dt.tableType = "Dining";
        dt.createTable();
        dt.move();

        DressingTable dt1 = new DressingTable();
        dt1.legs = 4;
        dt1.tableTop = true;
        dt1.material = new Material();
        dt1.tableType = "Dressing";
        dt1.createTable();
        dt1.move();
    }
}
