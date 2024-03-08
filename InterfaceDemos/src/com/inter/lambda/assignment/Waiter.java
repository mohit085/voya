package com.inter.lambda.assignment;

public class Waiter {

    public void availableItems(IMenus menu){
        System.out.println("welcome to my hotel");
        menu.showMenus();
        System.out.println("order now");
    }
}
