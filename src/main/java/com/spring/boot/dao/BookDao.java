package com.spring.boot.dao;

import java.util.List;

import com.spring.boot.entity.Book;

public interface BookDao {
    public List<Book> getAllBook();
    public List<Book> getBook(int id);
    public Book addBook(Book book);
    public void deleteBook(int id);
    public Book updateBook(Book book, int id);

}

