package com.example.designpattern.adapter;

import java.io.*;
import java.util.Date;

public class FileProperties extends Properties implements FileIO{

    public FileProperties(){
        super();
    }
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String comments = """
                # written by %s
                # %s
                """.formatted(this.getClass().getName(), new Date());
        store(new FileWriter(filename), comments);
    }

    @Override
    public void setValue(String key, String value) {
        getProperties().put(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperties().get(key);
    }
}
