package lesson11.prob2;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> h;

    public Library() {
        h = new HashMap<>();
    }

    public void addBook(Book b) {
        h.put(b.getISBN(), b);
    }

    public void borrowBook(String ISBN) {
        Book b = h.get(ISBN);
        if (b == null) {
            System.out.println("Book not found");
        } else if (b.isBorrowed()) {
            System.out.println("Book is already borrowed");
        } else {
            b.setBorrowed(true);
            System.out.println("Book borrowed");
        }
    }

    public void returnBook(String ISBN) {
        Book b = h.get(ISBN);
        if (b == null) {
            System.out.println("Book not found");
        } else if (!b.isBorrowed()) {
            System.out.println("Book is not already borrowed");
        } else {
            b.setBorrowed(false);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book b = h.get(ISBN);
        if (b == null) {
            return false;
        } else return b.isBorrowed();
    }

    public void getBookDetails(String ISBN) {
        Book b = h.get(ISBN);
        if (b == null) {
            System.out.println("Book not found");
        } else {
            System.out.println("-------- Book Details --------");
            System.out.println(b.toString());
        }
    }

    public void listAllBooks() {
        System.out.println("-------- List of books --------");
        for (Book b : h.values()) {
            System.out.println(b);
        }
    }

    public void listBorrowedBooks() {
        System.out.println("-------- List of borrowed books --------");
        for (Book b : h.values()) {
            if (b.isBorrowed()) {
                System.out.println(b.toString());
            }
        }
    }
}