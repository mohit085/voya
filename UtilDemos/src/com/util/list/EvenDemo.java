package com.util.list;

import  java.util.*;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> number1 = new ArrayList<>();
        number1.add(11);
        number1.add(20);
        number1.add(25);
        number1.add(60);
        number1.add(32);

        List<Integer> number2 = new ArrayList<>();

       ListIterator<Integer> iter1 = number1.listIterator(number1.size());
       while (iter1.hasPrevious()){
           Integer nums1 = iter1.previous();
           if(nums1%2==0){
               number2.add(nums1);
           }
       }

       ListIterator<Integer> iter2 = number2.listIterator(number2.size());
       while(iter2.hasPrevious()){
           Integer nums2 =  iter2.previous();
           System.out.println(nums2);
       }
    }
}
