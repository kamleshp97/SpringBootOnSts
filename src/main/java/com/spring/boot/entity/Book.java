package com.spring.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private int id;
    private String bookname;
    private String author;

    public Book(){}
    
    @Override
    public String toString() {
        return "Book [id=" + id + ", bookname=" + bookname + ", author=" + author + "]";
    }
    public Book(int id, String bookname, String author) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
}
