package oops.inheritance.tables;

import oops.inheritance.tables.Material;

public class Table {
    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void move(){
        System.out.println("Moving Table to another location");
    }
    public void createTable(){
        System.out.println("Create new table");
    }
}
