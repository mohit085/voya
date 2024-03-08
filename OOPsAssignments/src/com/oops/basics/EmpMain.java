package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("welcome");
        Employee employee =  new Employee("Mohit",85,25000);

        employee.getDetails();

        String s =employee.greet("welcome");
        System.out.println(s);
    }
}
