package com.util.list.custom;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("City","Honda",23_90_000),
                new Vehicle("Hexa","Tata",12_90_000),
                new Vehicle("Santro","Hyundai",43_90_000),
                new Vehicle("A100","Audi",45_90_000),
                new Vehicle("X10","Maruthi",1190000)
        );

        for (Vehicle vehicle : vehicles ){
            System.out.println(vehicle);
        }
        System.out.println();

        System.out.println("Sort by brannd");
        //pass the object of the class that implements Comprator
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle : vehicles ){
            System.out.println(vehicle);
        }
        System.out.println();

        System.out.println("Sort by class");
        // pass the object of the class that implements Comprator
        Collections.sort(vehicles,new ModelSort());
        for (Vehicle vehicle : vehicles ){
            System.out.println(vehicle);
        }
    }
}
