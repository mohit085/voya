package com.inter.lambda;

public class AnonyDemo {
    public static void main(String[] args) {
        //using a class  that implements the interface
        IGreeter greeter = new GreeterImpl();
        greeter.greetMessage("welcome to lambda");

        IGreeter greeter1 = new IGreeter() {
            //Anonymous class
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };

        //call the method
        greeter1.greetMessage("Great day");
    }
}
