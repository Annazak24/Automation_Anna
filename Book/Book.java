package Book;

import java.util.Objects;

public class Book {
    private Author author1;
    private String name;
    private int publishYear;
    private int pageNumber;


    public Author getAuthor1() {
        return author1;
    }

    public void setAuthor1(Author author1) {
        this.author1 = author1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public static int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book(Author author1, String name, int publishYear, int pageNumber) {
        this.author1 = author1;
        this.name = name;
        this.publishYear = publishYear;
        this.pageNumber = pageNumber;
    }

    public Book(Author author1, String name) {
        this.author1 = author1;
        this.name = name;
    }
    package Book;

    public class Book {
        private Author author1;
        private String name;
        private int publishYear;
        private int pageNumber;

        public Author getAuthor1() {
            return author1;
        }

        public void setAuthor1(Author author1) {
            this.author1 = author1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPublishYear() {
            return publishYear;
        }

        public void setPublishYear(int publishYear) {
            this.publishYear = publishYear;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public Book(Author author1, String name, int publishYear, int pageNumber) {
            this.author1 = author1;
            this.name = name;
            this.publishYear = publishYear;
            this.pageNumber = pageNumber;
        }

        public Book(Author author1, String name) {
            this.author1 = author1;
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name + "" + publishYear + "" + author1;
    }
public boolean equals(Object o, String name) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPublishYear() == book.getPublishYear() && getPageNumber() == book.getPageNumber() && Objects.equals(getAuthor1(), book.getAuthor1()) && Objects.equals(getName(), book.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor1(), getName(), getPublishYear(), getPageNumber());
    }
}
