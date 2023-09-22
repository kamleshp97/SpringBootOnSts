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
        allBooks.add(new Book(1, "Attitude is everything", "Jeff Keller"));
        allBooks.add(new Book(2, "Javascript and JQuery", "Murach"));
    }

    @Override
    public List<Book> getAllBook() {
      return allBooks;
    }

    @Override
    public List<Book> getBook(int id) {
       return allBooks.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
    }

    @Override
    public Book addBook(Book book) {
       allBooks.add(book);
       return book;
    }

    @Override
    public void deleteBook(int id) {
        List<Book> allData = getBook(id);
      
        System.out.println("allData: "+  allData.get(0)); //get index of book into list
        allBooks.remove(allData.get(0));
    }

    @Override
    public Book updateBook(Book book, int id) {
       List<Book> newBook =  allBooks.stream().filter(f -> f.getId() == id).map(m -> {
            m.setAuthor("kp");
            m.setBookname("my life");
            return m;
        }).collect(Collectors.toList());
        return newBook.get(0);
    }
    
}
