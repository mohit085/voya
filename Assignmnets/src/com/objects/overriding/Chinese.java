package com.objects.overriding;

class Chinese extends Menu {
    void showItems(String type){
        if(type.equals("starters")){
            System.out.println("noodels");
            System.out.println("shezwan");
            System.out.println("hakka noodels");
        } else if(type.equals("lunch")){
            System.out.println("Paneer chili");
            System.out.println("Manchurian");
            System.out.println("shezwan rice");
        } else {
            System.out.println("crystal cake");
            System.out.println("Almond jelly");
        }
    }

    void printGames(){
        System.out.println("board games available");
    }
}
