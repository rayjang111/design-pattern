package com.example.designpattern;

import com.example.designpattern.bridge.*;
import org.junit.jupiter.api.Test;

public class BridgePattern {
    @Test
    void main(){
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
    @Test
    void example_one(){
        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("Hello, Random Display"));
        d1.randomDisplay(5);
    }

    @Test
    void example_two(){
        Display d2 = new Display(new FileDisplayImpl("/Users/user/Desktop/samples/design-pattern/src/main/resources/random_text.txt"));
        d2.display();
    }

    @Test
    void example_three(){
        IterateDisplay d1 = new IterateDisplay(new SlashDisplayImpl("<", ">", "*",1));
        d1.iterateDisplay(4);
        IterateDisplay d2 = new IterateDisplay(new SlashDisplayImpl("|", "-", "#",2));
        d2.iterateDisplay(6);
    }
}
