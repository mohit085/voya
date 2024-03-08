package com.exceptions.custom;

public class CustomBank {
    double balance;
    public CustomBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException, NegativeBalanceException {
        System.out.println("In withdraw method");
        try {
            //balance is negative throw negativeBalanceException
            if (balance - amount <= 0)
                throw new NegativeBalanceException("balance is negative");

            // amount>1000 ExceedingLimitException
            if (amount > 1000)
                throw new OutOfLimitsException("Limit Exceed");

        } catch(NegativeBalanceException e) {
            System.out.println("exception.."+e.getMessage());
            throw e;

        } catch (OutOfLimitsException e) {
            System.out.println("exception.."+e.getMessage());
            throw e;

        } finally {
            System.out.println("close db");
        }

        System.out.println("work done");
    }
}
