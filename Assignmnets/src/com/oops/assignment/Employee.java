package com.oops.assignment;

public class Employee {
    String  employeename;

    String designation;

    public Employee(String employeename, String designation) {
        this.employeename = employeename;
        this.designation = designation;
    }

    double calcBonus(double baiscAllowance){
        return baiscAllowance;
    }

    double calcBonus(double baiscAllowance, double houseAllowance,String gift){
        System.out.println("Your gift  is "+gift);
        return baiscAllowance+ houseAllowance;
    }

    double calcBonus(double baiscAllowance ,double houseAllowance,double carAllowance,String gift ){
        System.out.println("Your gift  is "+gift);
        return baiscAllowance+houseAllowance+carAllowance;
    }
}
