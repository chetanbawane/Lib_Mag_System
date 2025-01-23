package com.example.demo.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.repos.BookRepos;

@Service
public class BookService {

	@Autowired
    private final BookRepos bookRepos;

    public BookService(BookRepos bookRepository) {
        this.bookRepos= bookRepository;
    }

    public List<Books> getAllBooks() {
        return bookRepos.findAll();
    }

    public Books getBookById(int id) {
        return bookRepos.findById(id).orElse(null);
    }

    public Books createBook(Books book) {
        return bookRepos.save(book);
    }

    public Books updateBook(int id, Books bookDetails) {
        return bookRepos.findById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setCategories(bookDetails.getCategories());
            book.setAuthors(bookDetails.getAuthors());
            return bookRepos.save(book);
        }).orElse(null);
    }

    public boolean deleteBook(int id) {
        if (bookRepos.existsById(id)) {
            bookRepos.deleteById(id);
            return true;
        }
        return false;
    }
}

