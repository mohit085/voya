package com.oops.overloading;

public class Vehicle {
    String brand;
    double  price;
    String model;

    // Constructor  Chainning
    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this();
        this.brand = brand;
    }

    public Vehicle(String brand, double price) {
        this(brand);
        this.price = price;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand,price);
        this.model = model;
    }

    void getDetails(){
        if(brand!=null)
        System.out.println("Brand "+brand);
        if(price>0)
        System.out.println("Price "+price);
        if(model!=null)
        System.out.println("model "+model);
    }
}
