package com.example.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book>{

    private ArrayList<Book> books;
    private int len = 0;

    public BookShelf(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        len +=1;
    }

    public int getLen(){
        return this.len;
    }

    public Book getBookAt(int pos){
        return books.get(pos);
    }



    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
