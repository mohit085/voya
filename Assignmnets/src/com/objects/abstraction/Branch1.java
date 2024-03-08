package com.objects.abstraction;

public class Branch1 extends Bank {

    void carLoan() {
        System.out.println("car loan in branch1");
    }

    void housingLoan() {
        System.out.println("housing loan is branch1");
    }

    void educationLoan(){
        System.out.println("edu loan is branch1");
    }
    void payInterest() {
        System.out.println("Interest from branch1");
    }
}
