package com.library.books;

import java.util.ArrayList;
import java.util.List;

public class Book {
        private String title;
        private String author;
        private String ISBN;
        private int publicationYear;
        private String category; // e.g., Fiction, Science, History
        private int totalCopies;
        private int availableCopies;
        private List<String> borrowerHistory; // track who borrowed

        public Book(String title, String author, String ISBN, int publicationYear, String category, int copies) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.publicationYear = publicationYear;
            this.category = category;
            this.totalCopies = copies;
            this.availableCopies = copies;
            this.borrowerHistory = new ArrayList<String>();
        }

        // Getters
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getISBN() { return ISBN; }
        public int getPublicationYear() { return publicationYear; }
        public String getCategory() { return category; }
        public int getTotalCopies() { return totalCopies; }
        public int getAvailableCopies() { return availableCopies; }
        public List<String> getBorrowerHistory() { return borrowerHistory; }

        // Borrowing methods
        public boolean borrow(String patronName) {
            if (availableCopies > 0) {
                availableCopies--;
                borrowerHistory.add(patronName);
                return true;
            }
            return false;
        }

        public boolean returnBook() {
            if (availableCopies < totalCopies) {
                availableCopies++;
                return true;
            }
            return false;
        }

        // Display info
        public void displayBook() {
            System.out.println(title + " by " + author + " (ISBN: " + ISBN +
                    ", Category: " + category + ", Available: " +
                    availableCopies + "/" + totalCopies + ")");
        }
    }

