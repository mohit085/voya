package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();
//        Map<Integer,String> hashmap = new LinkedHashMap<>();
//        Map<Integer,String> hashmap = new TreeMap<>();

        hashmap.put(1,"Java");
        hashmap.put(10,"Spring");
        hashmap.put(8,"Node");
        hashmap.put(null,"Css");
        hashmap.put(null,"Angular");  // css will replace by Angular
        hashmap.put(5,"Html");
        hashmap.put(1,"React");
        hashmap.put(100,null);
        hashmap.put(101,null);
        System.out.println(hashmap);
        System.out.println();

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(102)); //null

        System.out.println(hashmap.getOrDefault(102,"Jsp")); //insert default value
        System.out.println(hashmap.containsKey(1)); // true
        System.out.println();

        System.out.println(hashmap.values()); // to return the values

        //1st method to print the key value pair
        Set<Integer> keys = hashmap.keySet();
        for (Integer key : keys){
            System.out.println(key+" "+hashmap.get(key));
        }
        System.out.println();

        //2nd method to print the key value pair
        System.out.println("Using tree set");
        Set<Map.Entry<Integer,String>> entries = hashmap.entrySet();

        for(Map.Entry<Integer,String> entry : entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
