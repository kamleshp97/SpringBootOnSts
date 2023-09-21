package com.spring.boot.service;



import java.util.List;

import com.spring.boot.entity.Book;

public interface BookService {
    public List<Book> getAllBook();
    public List<Book> getBook(int id);
}
