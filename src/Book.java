public class Book {
    public String title;
    public String author;
    public boolean isavailability;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isavailability = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailability() {
        return isavailability;
    }

    public void borrowBook() {
        isavailability = false;
    }
    public void returnBook() {
        isavailability = true;
    }
    public void displayInfo() {
        System.out.println(title + " by " + author + (isavailability ? " (Available)" : " (Borrowed)"));

    }
}
