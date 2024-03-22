package com.bookapp.client;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IBookService bookService = new BookServiceImpl();

        Book book = new Book("Geometry","NCERT","Math",789.36);
        bookService.addBook(book);
    }
}
