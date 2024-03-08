package com.objects.abstraction;

public abstract  class Bank {
    abstract void carLoan();
    abstract void educationLoan();
    abstract void housingLoan();

    final void admin() {
        System.out.println("Admin details with bank");
    }

}
