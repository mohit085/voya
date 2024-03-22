package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService{

    private IBookRepository bookRepository = new BookRepositoryImpl();
    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    @Override
    public void UpdateBook(int bookId, double price) {
        bookRepository.UpdateBook(bookId,price);
    }

    @Override
    public void deleteBook(int bookId) {
        bookRepository.deleteBook(bookId);
    }

    @Override
    public Book getbyId(int bookId) throws IdNotFoundException {
        Book book = bookRepository.findById(bookId);
        if(book==null)
            throw new IdNotFoundException("Invalid id");
        return book;
    }


    @Override
    public List<Book> getAll() {
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> bookList =  bookRepository.findByAuthor(author);
        if (bookList.isEmpty())
            throw new BookNotFoundException("author not found");
        return bookList;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> bookList =  bookRepository.findByCategory(category);
        if (bookList.isEmpty())
            throw new BookNotFoundException("category not found");
        return bookList;

    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> bookList =  bookRepository.findByLesserPrice(price);
        if (bookList.isEmpty())
            throw new BookNotFoundException("price not found");
        return bookList;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> bookList =  bookRepository.findByAuthorCategory(author,category);
        if (bookList.isEmpty())
            throw new BookNotFoundException("author and category not found");
        return bookList;
    }

}
