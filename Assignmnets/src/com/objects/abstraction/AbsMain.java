package com.objects.abstraction;

public class AbsMain {
    public static void main(String[] args) {

        Bank bank = new Branch1();
        bank.educationLoan();
        bank.carLoan();
        bank.housingLoan();
        bank.admin();


    }
}
