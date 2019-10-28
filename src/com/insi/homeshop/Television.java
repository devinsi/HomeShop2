package com.insi.homeshop;

public class Television extends Product {
    private  int size;
    private String slabype;

    public Television( String name, String description, double price, int size, String slabype){
        super(name, description, price);
        this.size = size;
        this.slabype = slabype;
    }

    public int getSize() {
        return size;
    }

    public String getSlabype() {
        return slabype;
    }
}
