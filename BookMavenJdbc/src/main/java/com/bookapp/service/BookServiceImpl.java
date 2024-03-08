package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public class BookServiceImpl implements IBookService{

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void UpdateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public Book getbyId(int bookId) throws IdNotFoundException {
        return null;
    }
}
