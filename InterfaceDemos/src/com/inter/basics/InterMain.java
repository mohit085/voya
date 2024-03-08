package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEnterainment enterainment = new ManagerDetails();

        enterainment.showGames("indoor");
        enterainment.showActivity();

        enterainment = new DeveloperDetails();
        enterainment.showGames("outdoor");
        enterainment.showActivity();
    }
}
