package org.example;

import java.awt.print.Book;
import java.util.List;

public class User {
    String name;
    String userId;
    Boolean ticket;

    public void setTicket(Boolean ticket)
    {
        this.ticket=ticket;
    }
    public Boolean getTicket() {
        return ticket;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<BookCopy> getBooks() {
        return books;
    }

    public void setBooks(List<BookCopy> books) {
        this.books = books;
    }

    List<BookCopy> books;

    public User(String name, String userId, List<BookCopy> books) {
        this.name = name;
        this.userId = userId;
        this.books = books;
    }

    public void search(BookOriginal bookOriginal)
    {

    }
    public void borrowBooks(BookOriginal bookOriginal, BookCopy bookcopy)
    {
        BookCopy bookCopy=bookcopy;
        books.add(bookCopy);
    }
}
