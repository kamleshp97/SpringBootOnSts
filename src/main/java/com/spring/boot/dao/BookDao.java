package com.spring.boot.dao;

import java.util.List;

import com.spring.boot.entity.Book;

public interface BookDao {
    public List<Book> getAllBook();
    public List<Book> getBook(int id);
}
