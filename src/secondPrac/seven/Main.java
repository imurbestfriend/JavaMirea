package secondPrac.seven;

public class Main {
    public static void main(String[] args) {
        BookShelf book = new BookShelf();

        Book[] books = book.createBookArray();


        BookShelf book1 = new BookShelf("novel");
        book1.startShow();
    }
}
