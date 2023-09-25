package secondPrac.seven;

public class Main {
    private int x;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        BookShelf book = new BookShelf();

        Book[] books = book.createBookArray();


        BookShelf book1 = new BookShelf("novel");
        book1.startShow();

    }
}
