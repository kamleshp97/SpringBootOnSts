package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.BookDao;
import com.spring.boot.entity.Book;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();

    }
    @Override
    public List<Book> getBook(int id) {
       return bookDao.getBook(id);
    }
    @Override
    public Book addBook(Book book) {
        return bookDao.addBook(book);
    }
    @Override
    public void deleteBook(int id) {
        bookDao.deleteBook(id);
    }
    @Override
    public Book updateBook(Book book, int id) {
       return bookDao.updateBook(book, id);
    }
}
