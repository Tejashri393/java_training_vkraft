package vkraft_java_training_Day2;

import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true; // By default, a book is available
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully returned \"" + title + "\".");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: \"" + book.getTitle() + "\"");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books) {
                book.displayBookDetails();
                System.out.println("----------------------------");
            }
        }
    }

    public Book searchByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                return book;
            }
        }
        return null;
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "123456789"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "987654321"));
        library.addBook(new Book("1984", "George Orwell", "567891234"));

        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Search Book by ISBN");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = sc.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = sc.nextLine();
                    Book bookToBorrow = library.searchByISBN(borrowISBN);
                    if (bookToBorrow != null) {
                        bookToBorrow.borrowBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = sc.nextLine();
                    Book bookToReturn = library.searchByISBN(returnISBN);
                    if (bookToReturn != null) {
                        bookToReturn.returnBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.displayAllBooks();
                    break;
                case 5:
                    System.out.print("Enter ISBN to search: ");
                    String searchISBN = sc.nextLine();
                    Book book = library.searchByISBN(searchISBN);
                    if (book != null) {
                        book.displayBookDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

