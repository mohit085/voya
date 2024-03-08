package com.util.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
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

        //1st method
//        Vehicle vehicle = (Vehicle o1,Vehicle o2) ->{
//            return o1.getBrand().compareTo(o2.getBrand())
//        };

        // 2nd method
//        Collections.sort(vehicles,(o1, o2) ->o1.getBrand().compareTo(o2.getBrand()));
//        for (Vehicle vehicle : vehicles ){
//            System.out.println(vehicle);
//        }

//        Collections.sort(vehicles,);

    }
}
