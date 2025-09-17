package com.library.operations;

import com.library.books.Book;

public interface Searchable {
    Book searchByTitle(String title);
    Book searchByAuthor(String author);
    Book searchByISBN(String isbn);
}
