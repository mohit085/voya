package com.util.list.custom;

import java.util.*;


public class BookSetDemo {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("Java","Kathy",900),
                new Book("Leadership","Robin",350),
                new Book("Spring","Kathy",1900),
                new Book("JSP&Sevlets","Kathy",900)
        );
        System.out.println("List Book");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Set Books");

        Set<Book> bookSet = new LinkedHashSet<>(books);
        for (Book book : bookSet) {
            System.out.println(book);
        }

    }
}
