package com.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {
        //get a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 10; i++) {
            //pass the  implementation of runnable using lambda
            executorService.execute(() -> {
                System.out.println("doing task");
            });
            //all  the tasks are completed and allows a proper shutdown
        }
        executorService.shutdown();
    }
}