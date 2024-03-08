package com.thread.basic;

//3rd method we use when task is same
class A implements Runnable{

    @Override
    public void run() {
        System.out.println("Great Day");
    }
}

public class ClassDemo {
    public static void main(String[] args) {

        //1st method  we use all have different task
        Runnable task =  () -> {
            System.out.println("TasK1");
        };

        Thread t1 = new Thread(task,"pop");

        //2nd method
        Thread t2 = new Thread(()->{
            System.out.println("Task2");
        },"top");

        //3rd method
        Thread t3 = new Thread(new A(),"Task3");

        t1.start();
        t2.start();
        t3.start();
    }
}
