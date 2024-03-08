package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;


import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();

        IBookService bookService  = new BookServiceImpl(); // making object of implementation class

//        List<Book> booksByCategory;

        try{
            List<Book> booksByCategory = bookService.getByCategory("Tech");
            for(Book book : booksByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

    }
}
