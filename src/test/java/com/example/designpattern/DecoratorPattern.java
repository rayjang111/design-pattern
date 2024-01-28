package com.example.designpattern;

import com.example.designpattern.decorator.*;
import org.junit.jupiter.api.Test;

public class DecoratorPattern {
    @Test
    void main(){
        Display b1 = new StringDisplay("Hello, World");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        Display b4 = new FullBorder(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }

    @Test
    void exp_01(){
        Display b1 = new StringDisplay("Hello, World");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new UpdownBorder(b2);
        Display b4 = new FullBorder(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }

    @Test
    void exp_02(){
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hi");
        md.add("Good Morning");
        md.add("Good Night!");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }

}
