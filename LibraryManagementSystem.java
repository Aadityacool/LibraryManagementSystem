import java.util.*;

class Book {
    String title;
    String author;
    boolean isBorrowed;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}

public class LibraryManagementSystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        preloadBooks();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) addBook();
            else if (choice == 2) showBooks();
            else if (choice == 3) borrowBook();
            else if (choice == 4) returnBook();
            else if (choice == 5) break;
            else System.out.println("Invalid option.");
        }
    }

    static void preloadBooks() {
        books.add(new Book("Wings of Fire", "A.P.J. Abdul Kalam"));
        books.add(new Book("The White Tiger", "Aravind Adiga"));
        books.add(new Book("Train to Pakistan", "Khushwant Singh"));
        books.add(new Book("God of Small Things", "Arundhati Roy"));
        books.add(new Book("The Immortals of Meluha", "Amish Tripathi"));
    }

    static void addBook() {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added.");
    }

    static void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println((i + 1) + ". " + b.title + " by " + b.author + " [" + (b.isBorrowed ? "Borrowed" : "Available") + "]");
        }
    }

    static void borrowBook() {
        showBooks();
        System.out.print("Enter book number to borrow: ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < books.size()) {
            if (!books.get(index).isBorrowed) {
                books.get(index).isBorrowed = true;
                System.out.println("You borrowed: " + books.get(index).title);
            } else {
                System.out.println("Book already borrowed.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    static void returnBook() {
        showBooks();
        System.out.print("Enter book number to return: ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < books.size()) {
            if (books.get(index).isBorrowed) {
                books.get(index).isBorrowed = false;
                System.out.println("You returned: " + books.get(index).title);
            } else {
                System.out.println("This book was not borrowed.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }
}