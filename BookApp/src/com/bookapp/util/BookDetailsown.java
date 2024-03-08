package com.bookapp.util;

import java.util.*;
import com.bookapp.model.Book;
public class BookDetailsown {
        public static List<Book> showBooks() {
            List<Book> book = new ArrayList<>();
            book.add(new Book("Java in action", "John David", "Tech", 1, 900.90));
            book.add(new Book("Java in action", "John David", "Tech", 1, 900.90));
            book.add(new Book("Java in action", "John David", "Tech", 1, 900.90));
            return book;
        }

}
