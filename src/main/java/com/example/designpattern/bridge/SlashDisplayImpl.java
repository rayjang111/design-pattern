package com.example.designpattern.bridge;

import com.example.designpattern.bridge.DisplayImpl;

public class SlashDisplayImpl extends DisplayImpl {
    String start;
    String end;
    String string;
    int displayCount;
    public SlashDisplayImpl( String start, String end, String string, int displayCount) {
        this.start = start;
        this.end = end;
        this.string = string;
        this.displayCount = displayCount;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        for (int i=0 ; i< displayCount; i++) {
            System.out.print(string);
        }
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
