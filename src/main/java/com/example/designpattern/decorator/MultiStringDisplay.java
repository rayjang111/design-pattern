package com.example.designpattern.decorator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MultiStringDisplay extends Display{
    private List<String> stringList = new ArrayList<>();

    public void add(String string){
        stringList.add(string);
    }
    @Override
    public int getColumns() {
        return stringList.stream().mapToInt(String::length).max().orElseThrow();
    }

    @Override
    public int getRows() {
        return stringList.size();
    }

    @Override
    public String getRowText(int row) {
        int spaceNeeded = getColumns()-stringList.get(row).length();
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < spaceNeeded; i++) {
            spaces.append(" ");
        }
        return stringList.get(row) + spaces.toString();
    }
}
