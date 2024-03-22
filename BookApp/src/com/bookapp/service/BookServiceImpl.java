package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService{
    List<Book> books  = BookDetails.showBooks(); // taking data from database
    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books){
            if(book.getAuthor().startsWith(author))
                booksByAuthor.add(book);
        }
        if(booksByAuthor.isEmpty())
            throw new BookNotFoundException("Book by this author is not available");
        return booksByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> booksByCategory = new ArrayList<>();

        for(Book book : books) {
            if((book.getCategory()).equalsIgnoreCase(category))
            booksByCategory.add(book);
        }
        if(booksByCategory==null)
            throw new BookNotFoundException("Book doesn't exit with category"+category);
        return booksByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> booksByPriceLessThan = new ArrayList<>();
        for(Book book : books){
            if(book.getPrice()<=price)
                booksByPriceLessThan.add(book);
        }
        if(booksByPriceLessThan==null)
            throw new BookNotFoundException("books doesnt exits with price less than "+price);
        return booksByPriceLessThan;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> booksWithAuthorAndCategory = new ArrayList<>();
        for(Book book : books){
            if((book.getAuthor().toLowerCase()).equalsIgnoreCase(author.toLowerCase()) &&
                    (book.getCategory().toLowerCase()).equalsIgnoreCase(category.toLowerCase()));
            booksWithAuthorAndCategory.add(book);
        }
        if(booksWithAuthorAndCategory == null)
            throw new BookNotFoundException("Books doesnt exits starting with"+author);
        return booksWithAuthorAndCategory;
    }

    @Override
    public Book getbyId(int bookId) throws IdNotFoundException {

        for(Book book : books)  {
            if(book.getBookId()==bookId)
                return book;
        }
        throw new IdNotFoundException("book id  not found!!!!");
    }
}
