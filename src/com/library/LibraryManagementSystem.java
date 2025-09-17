package com.library;

import com.library.books.Book;
import com.library.management.Library;
import com.library.members.Patron;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        //Book details
        Book book1 = new Book("I too had a love story", "Chetan Bhagat", "ISBN001", 1949, "Fiction", 2);
        Book book2 = new Book("Shiva Triolgy", "Harper Lee", "ISBN002", 1960, "Fiction", 5);
        Book book3 = new Book("Core Java", "Pawan P", "ISBN003", 1925, "Education", 3);
        //adding books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //display available books in inventory
        library.displayAvailableBooks();

        //creating patrons
        Patron patron1 = new Patron("Varsha", "P001");
        Patron patron2 = new Patron("Praveen", "P002");
        Patron patron3 = new Patron("Viaan", "P003");
        Patron patron4 = new Patron("Muddu", "P004");

        //adding patron members to library
        library.addPatron(patron1);
        library.addPatron(patron2);

        //operations
        library.checkoutBook(book1, patron1);
        library.checkoutBook(book1, patron2);
        library.checkoutBook(book2, patron3);
        library.checkoutBook(book3, patron4);
        //displaying books borrowed by patron
        library.displayBorrowedBooks();

        //displaying available books in inventory
        System.out.println("\nAfter borrowing the books from patrons");
        library.displayAvailableBooks();



    }
}
