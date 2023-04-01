package com.bootcoding.java.collection.map;

public class Laptop implements Comparable<Laptop>{
    private String name;
    private int ram;
    private double price;

    public Laptop(){
    }

    public Laptop(String name, int ram, double price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Laptop laptop) {
        if(this.getRam()>laptop.getRam()){
            return 1;
        }else
        return -1;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
