package com.library.operations;

import com.library.books.Book;
import com.library.members.Patron;

public interface Lendable {
    boolean checkoutBook(Book book, Patron patron);
    boolean returnBook(Book book, Patron patron);
}
