package com.objects.bean;

public class BeanDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setBrand("mahindra");
        System.out.println(vehicle.getBrand());

        vehicle.setModel("Scorpio");
        System.out.println(vehicle.getModel());

        vehicle.setPrice(250000);
        System.out.println(vehicle.getPrice());
    }
}
