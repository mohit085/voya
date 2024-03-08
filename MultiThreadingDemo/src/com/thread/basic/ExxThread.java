package com.thread.basic;

class  child extends Thread {

       public child(String name,int priority) {
           super(name);
           System.out.println(this);
//           this.start();
       }

    //this is the cpu
    @Override
    public void run() {
        //write the logic to print 5th table 10 times
        for (int i=1;i<11;i++){
            String name =Thread.currentThread().getName();
            System.out.println(i+"x"+i+" = "+(i*5)+" "+name);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ExxThread {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        thread.setName("mohit");
//        System.out.println(thread);
//        thread.start();

//        child child1 = new child("child-1",10);
//        child child2 = new child("child-2",6);
        child child3 = new child("child-3",8);
        child3.setDaemon(true);
        child3.start();
        System.out.println();

        for (int i = 1; i < 11; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(i + "x" + i + " = " + (i * 5) + " " + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        try {
////            child1.join();
////            child2.join();
//            child3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("main completed");
    }
}

