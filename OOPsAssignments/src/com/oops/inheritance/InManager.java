package com.oops.inheritance;

public class InManager extends InEmployee {
        double salary;

        InManager(String employeename,int employeeId,double saalry){
            super(employeename,employeeId);
            this.salary=salary;
        }

        void printBonus(double amount){
            System.out.println("Bonus "+(amount+salary));
        }
}
