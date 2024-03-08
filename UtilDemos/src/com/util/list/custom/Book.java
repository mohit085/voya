package com.util.list.custom;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String authors;
    private double price;

    public Book() {
        super();
    }

    public Book(String title, String authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
//        String tit1 = this.getTitle();
//        String tit2 = o.getTitle();

        // if we want to sort with title
//        return this.getTitle().compareTo(o.getTitle());

        //if we want to sort with author
//        return this.getAuthors().compareTo(o.getAuthors());

        //if we want to sort with price
        Double price1  = this.getPrice();

        return price1.compareTo(o.getPrice());


//      OR
//        return ((Double)this.getPrice()).compareTo(o.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authors, price);
    }
}
