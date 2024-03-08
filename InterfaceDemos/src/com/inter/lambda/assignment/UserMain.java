package com.inter.lambda.assignment;

public class UserMain {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        waiter.availableItems(()->{
            System.out.println("1.Dosa 2.Idli");
        });
    }
}
