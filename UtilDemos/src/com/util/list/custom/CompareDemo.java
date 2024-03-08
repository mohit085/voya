package com.util.list.custom;

import java.util.*;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("java","Kathy",900),
                new Book("5amclub","Robin",350),
                new Book("Leadership","Robin",900),
                new Book("Spring","Kathy",1900),
                new Book("JSP&Sevlets","Kathy",900)
        );

        // before  sorting
        for(Book book1: books){
            System.out.println(book1);
        }
        System.out.println();
        //After sorting
        Collections.sort(books);
        for (Book book2:books){
            System.out.println(book2);
        }
    }
}
