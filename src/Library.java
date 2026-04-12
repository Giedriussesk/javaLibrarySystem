import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();

    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailability()) {
                book.borrowBook();
                System.out.println("You have borrowed the book!");
                return;

            }
        }
        System.out.println("The requested book is not available. Sorry!");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailability()) {
                book.returnBook();
                System.out.println("The book has been returned. Thanks!");
                return;
            }
        }
        System.out.println("The book cannot be found or it might have been returned already.");
    }
}
