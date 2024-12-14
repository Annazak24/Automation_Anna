package Book;

import java.util.Arrays;
import java.util.Objects;

public class Library {
   public Book book1;
   private Book[] books = {book1};

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library(Book[] books) {
        this.books = books;
    }

    Library library = new Library(getBooks());


    public Book getBook(String name) {
        Book result = null;
        for (int i = 0; i <= books.length - 1; i++) {
            if (Book.equals(name, books[i].getName())) {
                result = books[i];
            }
        }
        return result;
    }

    public String[] getNames() {
        String[] bookNames = null; {
        }
        for (Book book; books) {
            for (int i = 0; i <= library.books.length - 1; i++) {
                bookNames[i] = new String[library.books[i].getName(];

            }
        }
        return bookNames;
    }

}
