package com.util.Hashset;

import java.util.*;


public class SetDemo {
    public static void main(String[] args) {
//        Set<String> hashset = new HashSet<>();
//        Set<String> hashset = new LinkedHashSet<>();
        Set<String> hashset = new TreeSet<>();

        hashset.add("Apple");
        hashset.add("Pineapple");
        hashset.add("Orange");
        hashset.add("banana");
        hashset.add("Kiwi");
        hashset.add("100");

//        hashset.add(null);

        hashset.add("Apple"); // duplicates

        System.out.println(hashset);

        for(String element : hashset) {
            System.out.println(element);
        }

//        List<String> fruits  = Arrays.asList("")
    }
}
