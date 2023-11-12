package com.example.designpattern.bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDisplayImpl extends DisplayImpl {
    String filePath;
    List<String> lines;
    public FileDisplayImpl(String filePath){
        this.filePath = filePath;
        Path path = Paths.get(filePath);
        lines = readFile(path);
    }
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        for (String line : lines){
            System.out.println(line);
        }
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine(){
        System.out.println("-----------------------------");
    }

    public List<String> readFile(Path path){
        try    {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
