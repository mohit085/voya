package com.inter.extend;

public class MainCalculator {
    public static void main(String[] args) {
        ICalculator iCalculator = new BasicCalculator();
        iCalculator.product(10,20);

        iCalculator.add(10,20);

        
    }
}
