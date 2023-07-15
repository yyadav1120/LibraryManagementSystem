package org.example;

public class BookOriginal {
    String book_id;
    String title;
    String authors;
    String publishers;

    public BookOriginal(String book_id, String title, String authors, String publishers) {
        this.book_id = book_id;
        this.title = title;
        this.authors = authors;
        this.publishers = publishers;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublishers() {
        return publishers;
    }
}
