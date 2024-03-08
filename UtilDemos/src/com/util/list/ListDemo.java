package com.util.list;

import java.util.*;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        System.out.println(list.size());
        list.add("java");
//        list.add(100); // class cast Exception
        list.add("");
        list.add("sql");
        list.add("125.36");
        list.add("true");

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
//        }
//        System.out.println();
//
//        ListIterator<String> iter = list.listIterator(list.size());
//        while (iter.hasPrevious()){
//            String str = iter.previous();
//            System.out.println(str);
//        }
//        System.out.println("....");
//
//        System.out.println("Sorting the list");
//        Collections.sort(list);
//        for(String val: list)
//            System.out.println(val.toUpperCase());
        System.out.println(list.get(2));
    }
}
