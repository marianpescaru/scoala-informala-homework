package com.sci.bv;

import java.time.LocalDate;

public class Product implements IsSaleable{

    // setup of Product class, with characteristics, constructor, getter and setter;

    String name;
    int quantity;
    double price;
    double weight;
    LocalDate validityDate;
    String productID;

    public Product(String name,int quantity,double price, double weight, LocalDate validityDate, String productID) {
        if (name == null){
            throw new IllegalArgumentException(); // avoids creating a new product without a name;
        }
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.validityDate = validityDate;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
