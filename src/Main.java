import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("****** Welcome to the Library Portal ******");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title of the book: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter the authors name: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("Enter the title of the book to be borrowed: ");
                    library.borrowBook(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("Enter the title of the book to be returned: ");
                    library.returnBook(scanner.nextLine());
                    break;
            }
        } while (choice != 5);

        scanner.close();

    }
}
