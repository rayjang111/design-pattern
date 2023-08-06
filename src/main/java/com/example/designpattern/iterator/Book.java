package com.example.designpattern.iterator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String name;
    public Book(String name){
        this.name = name;
    }
}
