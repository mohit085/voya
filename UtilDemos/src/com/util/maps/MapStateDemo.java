package com.util.maps;

import java.util.*;
public class MapStateDemo {
    public static void main(String[] args) {
        Map<String,List<String>> statemap = new HashMap<>();

        statemap.put("Bihar",Arrays.asList("Patna","Munger","Sitamadhi"));
        statemap.put("Jarkhand",Arrays.asList("Ranchi","dhurva","Hatia"));
        statemap.put("UP",Arrays.asList("Luckhnow","Ayodhya","Mathura"));
        statemap.put("Gujrat",Arrays.asList("Vadodra","Gandhinagar","Ahemdabad"));
        statemap.put("Assam",Arrays.asList("Guwahati","Tezpur","Dispur"));

        System.out.println(statemap);
        System.out.println(statemap.values());

        for(Map.Entry<String,List<String>> stateEntries : statemap.entrySet()){
            System.out.println(stateEntries.getKey());
            List<String> cities = stateEntries.getValue();
            for(String city : cities){
                System.out.println(city);
            }
        }

        for (String stateName : statemap.keySet()) {
            System.out.println("State: "+stateName);
            List<String> cities = statemap.get(stateName);
            for (String city : cities) {
                System.out.println("City:  "+city);
            }
        }

    }
}
