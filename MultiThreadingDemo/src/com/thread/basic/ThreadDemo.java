package com.thread.basic;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("mohit");
        thread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println(thread);
        thread.setName("sahil");
        int[] nums =null;
        System.out.println(nums[0]);
    }

}
