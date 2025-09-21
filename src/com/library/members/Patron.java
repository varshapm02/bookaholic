package com.library.members;

import com.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String id;
    private List<Book> borrowedBooks;
    private double outstandingBalance = 0.0;

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
        borrowedBooks = new
                ArrayList<Book>();
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayPatron() {
        System.out.println(name + " (ID: " + id + ")");
    }
    public void addFine(double amount) {
        outstandingBalance += amount;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void clearBalance() {
        outstandingBalance = 0.0;
    }
}
