package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle();
            v1.getDetails();

        Vehicle v2= new Vehicle("Mahindra");
            v2.getDetails();


        Vehicle v3= new Vehicle("Tata",1564.51);
            v3.getDetails();


        Vehicle v4= new Vehicle("Mahindra",58956.12,"Scorpio");
            v4.getDetails();

    }
}
