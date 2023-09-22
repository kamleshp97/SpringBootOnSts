package com.spring.boot.service;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.boot.entity.Book;

public interface BookService {
    public List<Book> getAllBook();
    public List<Book> getBook(int id);
    public Book addBook(Book book);
    public void deleteBook(int id);
    public Book updateBook(Book book, int id);

}
