package com.util.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("node");
        list.add("angular");
        list.add("maven");
        System.out.println(list);
        list.add("Html");
        list.add("Css");
        list.add("react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
    }
}
