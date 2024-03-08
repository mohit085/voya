package com.thread.basic;

class Runner implements Runnable{
    String name;
    Greetings greetings;

    public Runner(String name,Greetings greetings) {
        Thread t = new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        t.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
//        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }
    }
}
public class RunThread {
    public static void main(String[] args) {
        Greetings  greetings = new Greetings();
        Runner runner1 = new Runner("mohit",greetings);
        Runner runner2 = new Runner("sahil",greetings);
        Runner runner3 = new Runner("AYSUH",greetings);
        Runner runner4 = new Runner("rohan",greetings);
//        Thread thread1 = new Thread(runner,"Thread-one");
//        Thread thread2 = new Thread(runner,"Thread-two");

//        thread1.start();
//        thread2.start();
    }
}
