package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookService;

@RestController
public class FirstRestController {
    @Autowired
    private BookService book;

    @GetMapping("/allBooks")
    public List<Book> getAllBook(){
        List<Book> b = book.getAllBook();
        return b;
    }

    @GetMapping("/book/{id}")
    public List<Book> getBook(@PathVariable("id") int id){
        return book.getBook(id);
    }
}
