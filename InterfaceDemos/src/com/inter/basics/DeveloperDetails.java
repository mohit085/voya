package com.inter.basics;

public class DeveloperDetails implements IEnterainment {
    @Override
    public void showGames(String type) {
        if(type.equalsIgnoreCase("indoor"))
            System.out.println("carrom , badminton are available");
        else
            System.out.println("Cricket");
    }

    @Override
    public void showActivity() {
        System.out.println("weekly lunch outing");
    }
}
