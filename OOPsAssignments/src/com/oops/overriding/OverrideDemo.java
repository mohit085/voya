package com.oops.overriding;
import java.util.Scanner;
public class OverrideDemo {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String choice = sc.next();
        Sports sports = null;

        if(choice.equals("indoor"))
            sports = new Indoor();

        else if (choice.equals("outdoor"))
            sports = new Outdoor();

        else
            sports = new Sports();

        String[] games  = sports.showTypes();

        if(games != null)
        for(String game : games)
            System.out.println(game);
    }
}
