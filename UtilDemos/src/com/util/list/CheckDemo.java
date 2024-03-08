package com.util.list;

import java.util.*;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("watermelon");
        fruits.add("lichi");
        fruits.add("chiku");
        fruits.add("pineapple");
        fruits.add("pomegrante");

        List<String> fruits2 = new ArrayList<>();

        for(String fruit : fruits){
            if(fruit.startsWith("G"))
                fruits2.add(fruit);
//                System.out.println(search);
        }

        for(String fruit : fruits){
            if(fruit.endsWith("e"))
                fruits2.add(fruit);
//                System.out.println(search);
        }

        for(String fruit : fruits){
            if(fruit.contains("apple"))
                fruits2.add(fruit);
//                System.out.println(search);
        }

        ListIterator<String> iter = fruits2.listIterator(fruits2.size());
        while (iter.hasPrevious()){
            String str = iter.previous();
            System.out.println(str);
        }


    }
}
