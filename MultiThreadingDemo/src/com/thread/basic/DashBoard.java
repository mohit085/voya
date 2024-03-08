package com.thread.basic;

public class DashBoard {
    public static void main(String[] args) {
        Booking booking = new Booking();

        Counter counter1 = new Counter("Tom",10,booking);
        Counter counter2 = new Counter("Sam",20,booking);
        Counter counter3 = new Counter("Jo",12,booking);
    }
}
