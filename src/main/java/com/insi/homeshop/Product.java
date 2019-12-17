package com.insi.homeshop;


/**
 *
 *
 */
public class Product {

    private String name;
    private String description;
    private double price;

    public Product(String name, String description, Double price){
    this.name = name;
    this.description = description;
    this.price = price;
    }

    /**
     *Display a full description of the product
     */
    public void look(){

    }
    /**
     * Add a product to a bill
     * @param bill the concerned bill
     * @param quantity the quantity of the product to add
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
