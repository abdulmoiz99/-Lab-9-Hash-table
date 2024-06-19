package lesson11.prob2;

public class Main {
    //Test class to check the functionality
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Key1", "BookTittle1", "BookAuthor1"));
        lib.addBook(new Book("Key1", "BookTittle1", "BookAuthor1"));
        lib.addBook(new Book("Key2", "BookTittle2", "BookAuthor2"));
        lib.addBook(new Book("Key3", "BookTittle3", "BookAuthor3"));
        lib.listAllBooks();
        lib.borrowBook("Key1");
        lib.borrowBook("Key1");
        lib.listBorrowedBooks();
        lib.returnBook("Key1");
        lib.listBorrowedBooks();
        System.out.println(lib.isBookBorrowed("Key1"));
        lib.borrowBook("Key1");
        System.out.println(lib.isBookBorrowed("Key1"));
        lib.getBookDetails("Key1");

    }
}