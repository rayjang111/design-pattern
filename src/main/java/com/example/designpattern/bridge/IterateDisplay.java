package com.example.designpattern.bridge;

public class IterateDisplay extends Display {

    public IterateDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void iterateDisplay( int lineIteration) {
        for (int i = 0; i < lineIteration; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();
            }
            close();
        }
    }
}
