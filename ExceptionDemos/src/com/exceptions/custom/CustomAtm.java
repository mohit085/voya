package com.exceptions.custom;

public class CustomAtm {
    public static void main(String[] args) {
        CustomBank customBank = new CustomBank(1455.25);

        try{
            customBank.withdraw(1540.23);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye");
    }
}
