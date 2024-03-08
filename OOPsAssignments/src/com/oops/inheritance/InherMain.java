package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Mohit",85);
        inEmployee.getDetails();

        InManager inManager = new InManager("sahil",30,446.32);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
