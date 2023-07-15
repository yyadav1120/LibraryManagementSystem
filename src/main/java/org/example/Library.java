package org.example;
import java.util.ArrayList;
public class Library {
    String Id;
    int no_racks;
    BookCopy bookCopy;
    ArrayList<BookCopy>[] racks = new ArrayList[no_racks];
    public void createLibrary(int no_racks)
    {
        System.out.println("Created library with"+no_racks+"racks");
    }
    public void addBooks(BookCopy bookCopy)
    {
        for(int i=1;i<=no_racks;i++)
        {
            Boolean flag=false;
            for(BookCopy book: racks[i]) {
                if (book.getBookOriginal().getTitle() == bookCopy.getBookOriginal().getTitle()) {
                    flag = true;
                }
            }
            if(flag==false)
            {
                racks[i].add(bookCopy);
            }
        }
    }
    public void addreturned(User user)
    {
        for(BookCopy book: user.getBooks())
        {
            addBooks(book);
        }
        user.setTicket(true);
    }
}
