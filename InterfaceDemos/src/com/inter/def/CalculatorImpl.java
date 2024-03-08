package com.inter.def;

public class CalculatorImpl implements IBonusCalculator,IAllowanceCalculator{
    public void calculate(double amount){
        System.out.println(amount*5);
    }

    @Override
    public void policyType() {
        System.out.println("policy type for all employees");
        IBonusCalculator.super.policyType();
        IAllowanceCalculator.super.policyType();
    }

}
