package com.spring.boot.dao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Book;

@Repository
public class BookDaoImpl implements BookDao{

    private static List<Book> allBooks = new LinkedList<>();
    static{
         allBooks = Arrays.asList(new Book(1, "Attitude is everything", "Jeff Keller"),
                new Book(2, "Javascript and JQuery", "Murach"));
    }

    @Override
    public List<Book> getAllBook() {
      return allBooks;
    }

    @Override
    public List<Book> getBook(int id) {
       return allBooks.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
    }
    
}
