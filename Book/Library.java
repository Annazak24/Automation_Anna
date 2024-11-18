package Book;

public class Library {
    private Book book1;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library(Book[] books) {
        this.books = books;
    }
    Library library= new Library(book1);

    private Book[] books = {book1};
    public Book getBook(String name){
        Book result = null;
        for(int i=0;i<=books.length-1;i++){
            if(name==books[i].getName()){
                result= books[i];
            }
        }
       return result;
    }
    public Book[] getNames(){
        Book[] bookNames=null;
        for (Book book; books) {
            for (int i = 0; i < ); i++) {

            }
        }
    }
}
