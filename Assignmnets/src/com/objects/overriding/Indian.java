package com.objects.overriding;

class Indian extends Menu {
    void showItems(String type){
        if(type.equals("starters")){
            System.out.println("litti chokha");
            System.out.println("puri sabzi");
            System.out.println("aalu pratha");
        } else if(type.equals("lunch")){
            System.out.println("rice daal ");
            System.out.println("roti sabzi");
            System.out.println("tandori roti");
        } else {
            System.out.println("kaju barfi");
            System.out.println("rasogulla");
        }
    }
}
