package secondPrac.seven;

import secondPrac.one.Author;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    private Book book;
    public BookShelf(String book){
        this.book = new Book(book);
    }
    public void startShow(){
        book.showType();
    }

    public BookShelf(){}
    public static Book[] createBookArray() {

        Book[] books = {
                new Book("Alice","title1", 25),
                new Book("Charlie", "title1", 30),
                new Book("Bob", "title1", 20)
        };

        Arrays.sort(books, Comparator.comparingInt(Book::getAge));
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getName() + "Year " + book.getAge());
        }
        return books;
    }
}
