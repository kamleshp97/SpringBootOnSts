package com.spring.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookService;

@RestController
public class FirstRestController {
    @Autowired
    private BookService book;

    @GetMapping("/allBooks")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> b = book.getAllBook();
        if(b.size() <= 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(b);
    }

    @GetMapping("/book/{id}")
    public List<Book> getBook(@PathVariable("id") int id){
        return book.getBook(id);
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book b){
        System.out.println("b: "+b);
        Book b1 =  book.addBook(b);
        return b1;
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable("id") int id){
        book.deleteBook(id);
        System.out.println("Book deleted with id = "+id);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@RequestBody Book b, @PathVariable("id") int id){
        return book.updateBook(b, id);
    }
}
