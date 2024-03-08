package com.inter.lambda;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu iMenu = () -> {
            System.out.println("Chineese food");
            System.out.println("Noodles");
        };
        iMenu.showMenus();

       iMenu = () -> {
           System.out.println("Indian food");
            System.out.println("litti chokha");
        };
       iMenu.showMenus();

       iMenu = () -> {
           System.out.println("italian");
            System.out.println("Pizza");
        };
       iMenu.showMenus();
    }
}
