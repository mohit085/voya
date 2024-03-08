package com.inter.assignment2;

public abstract class Vehicle implements IInsurance{

    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Brand "+price);
    }

    abstract void getMileage();

}
