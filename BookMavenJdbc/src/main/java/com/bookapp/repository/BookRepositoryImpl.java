package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

// from hereconnect to db
public class BookRepositoryImpl implements IBookRepository{
    @Override
    public void addBook(Book book) {
        //establish connection


    }

    @Override
    public void UpdateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public Book findById(int bookId) throws IdNotFoundException {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
        return null;
    }
}
