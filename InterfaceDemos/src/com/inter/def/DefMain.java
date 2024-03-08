package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();

        // static method
        IBonusCalculator.show();

        IAllowanceCalculator allowance=(IAllowanceCalculator) bonusCalculator;
        allowance.calculate(1000);
        allowance.policyType();
    }
}
