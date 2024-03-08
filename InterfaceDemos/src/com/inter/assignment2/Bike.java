package com.inter.assignment2;

public class Bike extends Vehicle implements IExternal{
    public Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void showAcc() {
        System.out.println("Music System");
    }

    @Override
    public void exterior() {
        System.out.println("black colour");
    }

    @Override
    public void insuranceDetails() {
        System.out.println("bajaj finace");
    }

    @Override
    void getMileage() {
        System.out.println("40km/hr");
    }
}
