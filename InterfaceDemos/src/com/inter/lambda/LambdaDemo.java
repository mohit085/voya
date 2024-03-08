package com.inter.lambda;

public class LambdaDemo {
    // implemrnt using lambda expressions
    public static void main(String[] args) {


    IGreeter greet = (String message) -> {
        System.out.println(message);
    };
    // call the method
    greet.greetMessage("Great Day");

    greet = message -> System.out.println(message+"!!!!");
    greet.greetMessage("Wow");
 }
}