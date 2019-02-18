package com.sci.bv;

import java.time.LocalDate;

public class VegetalProduct extends Product {

    // setup of Vegetal Product class, with characteristics, constructor, getter and setter;
    // inherits from Product class;

    String listOfVitams;

    public VegetalProduct(String name, int quantity, double price, double weight, LocalDate validityDate,
                          String productID, String listOfVitams) {
        super(name, quantity, price, weight, validityDate, productID);
        this.listOfVitams = listOfVitams;
    }

    public String getListOfVitams() {
        return listOfVitams;
    }

    public void setListOfVitams(String listOfVitams) {
        this.listOfVitams = listOfVitams;
    }
}
