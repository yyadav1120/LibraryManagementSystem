package org.example;

public class BookCopy {
    BookOriginal bookOriginal;
    String book_copy_id;

    public BookCopy(BookOriginal bookOriginal, String book_copy_id) {
        this.bookOriginal = bookOriginal;
        this.book_copy_id = book_copy_id;
    }

    public BookOriginal getBookOriginal() {
        return bookOriginal;
    }

    public void setBookOriginal(BookOriginal bookOriginal) {
        this.bookOriginal = bookOriginal;
    }

    public String getBook_copy_id() {
        return book_copy_id;
    }

    public void setBook_copy_id(String book_copy_id) {
        this.book_copy_id = book_copy_id;
    }
}
