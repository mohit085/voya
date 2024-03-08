package com.objects.overriding;

public class Restraunt {
    public static void main(String[] args) {
        Menu menu1 = new Chinese();  // super class not working  it just giving  the reference or hust giving the  order
//        menu1.showItems("lunch");
//
//        Menu menu2 = new Indian();
//        menu2.showItems("sweets");
//
//        Chinese menu3 = new Chinese();
//        menu3.showItems("starters");
//
//        Indian menu4 = new Indian();
//        menu4.showItems("lunch");

        Chinese chinese = (Chinese)menu1;  // down  casting
        chinese.printGames();
    }
}
