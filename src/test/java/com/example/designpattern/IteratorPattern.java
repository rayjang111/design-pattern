package com.example.designpattern;

import com.example.designpattern.Iterator.Book;
import com.example.designpattern.Iterator.BookShelf;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class IteratorPattern {

    @Test
    void iterateBooks(){
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("book1"));
        bookShelf.addBook(new Book("book2"));
        bookShelf.addBook(new Book("book3"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book selectedBook = iterator.next();
            System.out.println(selectedBook.getName());
        }
    }

    @Test
    void iterateBooks2(){
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("book1"));
        bookShelf.addBook(new Book("book2"));
        bookShelf.addBook(new Book("book3"));
        for (Book book: bookShelf){
            System.out.println(book.getName());
        }
    }

}