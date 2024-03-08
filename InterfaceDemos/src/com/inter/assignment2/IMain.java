package com.inter.assignment2;

public class IMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Car("mahindra","Scorpio",22000000);
        vehicle.getDetails();
        vehicle.getMileage();

        vehicle = new Bike("BMW","gg310rr",400000);
        vehicle.getDetails();
        vehicle.getMileage();

//        Car car = new Car("volkswagen","virtus",150000);
//        car.exterior();
//        car.interior();
//        car.insuranceDetails();
//        car.showAcc();
//        car.getMileage();
//        car.getDetails();




    }
}
