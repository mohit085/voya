package com.oops.overloading;


public class VarargsDemo {

    void calcsum(String name,int... marks){
        System.out.println("Welcome " + name);
        int sum=0;
        for(int mark : marks)
            sum+=mark;
        System.out.println("Sum " + sum);
    }
    void  calcsum(String name) {
        System.out.println("Hello  "+ name);
    }

    public static void main(String[] args) {
        VarargsDemo  demo  = new VarargsDemo();
        demo.calcsum("mohit",90,80,90);
        demo.calcsum("sahil");
        demo.calcsum("ayush",90,80);
    }
}
