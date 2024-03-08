package com.thread.concurrency;

import com.thread.basic.Booking;
import com.thread.basic.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //creating independent tasks
        executorService.execute(()->{
            System.out.println("Doing polling");
            //call Greetings class
            Greetings greet = new Greetings();
            greet.sayHello("priya");
        });

        executorService.execute(()->{
            // call the  tasks of booking tickets
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Sri",20));
        });

        executorService.execute(()->{
            System.out.println("Reading from db");
            //call the method of DbConnector class
        });
    }
}
