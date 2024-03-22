package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// from here connect to db
public class BookRepositoryImpl implements IBookRepository {
    @Override
    public void addBook(Book book) {
        //establish connection
        // create a prepared statement
        // set values for placeholders
        // call  execute method
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setString(3, book.getCategory());
            statement.setDouble(4, book.getPrice());

            // call execute
            boolean result = statement.execute();
            System.out.println("Inserted book  element" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void UpdateBook(int bookId, double price) {
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {
            statement.setInt(1, bookId);
            statement.setDouble(2, price);

            // call execute
            boolean result = statement.execute();
            System.out.println("Updated book  element" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int bookId) {
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
        ) {
            statement.setInt(1, bookId);

            // call execute
            boolean result = statement.execute();
            System.out.println("Deleted book  element" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Book findById(int bookId) throws IdNotFoundException {
        Book book = null;
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYIDQUERY);
        ) {
            statement.setInt(1, bookId);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {

                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String category = resultSet.getString("category");
                    double price = resultSet.getDouble("price");

                    book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);

                }
            }
            // call execute
            boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTQUERY)

        ) {
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {

                    int bookId = resultSet.getInt("bookId");
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String category = resultSet.getString("category");
                    double price = resultSet.getDouble("price");

                    Book book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);
                    bookList.add(book);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        List<Book> bookList = new ArrayList<>();
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYAUTHORQUERY);
        ) {
            statement.setString(1, author);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    int bookId = resultSet.getInt("bookId");
                    String title = resultSet.getString("title");
                    String category = resultSet.getString("category");
                    double price = resultSet.getDouble("price");

                    Book book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);
                    bookList.add(book);

                }
            }
            // call execute
            boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public List<Book> findByCategory(String category) throws BookNotFoundException {
        List<Book> bookList = new ArrayList<>();
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYCATEGORYQUERY);
        ) {
            statement.setString(1, category);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    int bookId = resultSet.getInt("bookId");
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    double price = resultSet.getDouble("price");

                    Book book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);
                    bookList.add(book);

                }
            }
            // call execute
            boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        List<Book> bookList = new ArrayList<>();
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYPRICEQUERY);
        ) {
            statement.setDouble(1, price);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    int bookId = resultSet.getInt("bookId");
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String category = resultSet.getString("category");

                    Book book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);
                    bookList.add(book);

                }
            }
            // call execute
            boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
        List<Book> bookList = new ArrayList<>();
        try (
                Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYAUTHCATQUERY);
        ) {
            statement.setString(1, author);
            statement.setString(2, category);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    int bookId = resultSet.getInt("bookId");
                    String title = resultSet.getString("title");
                    double price = resultSet.getDouble("price");

                    Book book = new Book();

                    book.setBookId(bookId);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setPrice(price);
                    bookList.add(book);

                }
            }
            // call execute
            boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
