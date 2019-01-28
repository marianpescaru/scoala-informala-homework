package com.sci.bv;

import java.time.LocalDate;

public class AnimalProduct extends Product {

    // setup of Animal Product class, with characteristics, constructor, getter and setter;
    // inherits from Product class;

    int storageTemp;

    public AnimalProduct(String name, int quantity, double price, double weight, LocalDate validityDate,
                         String productID, int storageTemp) {
        super(name, quantity, price, weight, validityDate, productID);
        this.storageTemp = storageTemp;
    }

    public int getStorageTemp() {
        return storageTemp;
    }

    public void setStorageTemp(int storageTemp) {
        this.storageTemp = storageTemp;
    }
}
