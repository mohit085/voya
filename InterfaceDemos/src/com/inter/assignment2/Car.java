package com.inter.assignment2;

public class Car extends Vehicle implements IInsurance,IExternal,IInternal {
    public Car(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void showAcc() {
        System.out.println("Car cover");
    }

    @Override
    public void insuranceDetails() {
        System.out.println("Acko insurance");

    }

    @Override
    void getMileage() {
        System.out.println("20km/hr");
    }

    @Override
    public void exterior() {
        System.out.println("sunroof");
    }

    @Override
    public void interior() {
        System.out.println("oled screen");
    }
}
