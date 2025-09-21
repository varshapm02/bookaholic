package com.library.management;

import com.library.books.Book;
import com.library.members.Patron;
import com.library.operations.Lendable;
import com.library.operations.Searchable;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable, Lendable {
        private List<Book> books;
        private List<Patron> patrons;

    public Library() {
        books = new ArrayList<Book>();
        patrons = new ArrayList<Patron>();
    }

    public void addBook(Book book) { books.add(book); }
    public void removeBook(Book book) { books.remove(book); }

    public void addPatron(Patron patron) { patrons.add(patron); }
    @Override
    public boolean checkoutBook(Book book, Patron patron) {
        if (book != null && book.borrow(patron.getName())) {
            patron.borrowBook(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(Book book, Patron patron) {
        if (book != null && book.returnBook()) {
            patron.returnBook(book);
            return true;
        }
        return false;
    }

    @Override
    public Book searchByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.get(i).displayBook(); // print details here
                return books.get(i);
            }
        }
        System.out.println("No book found with title: " + title);
        return null;
    }

    @Override
    public Book searchByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                books.get(i).displayBook(); // print details here
                return books.get(i);
            }
        }
        System.out.println("No book found by author: " + author);
        return null;
    }

    @Override
    public Book searchByISBN(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(isbn)) { // ISBN is case-sensitive
                books.get(i).displayBook(); // print details here
                return books.get(i);
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books in Library:");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAvailableCopies() > 0) {
                books.get(i).displayBook();
            }
        }
    }
    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed Books and Patrons:\n");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            List<String> borrowers = book.getBorrowerHistory();
            if (borrowers.size() > 0) {
                System.out.print(book.getTitle() + " borrowed by: ");
                for (int j = 0; j < borrowers.size(); j++) {
                    System.out.print(borrowers.get(j));
                    if (j < borrowers.size() - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }
    }
}
