package com.example.designpattern;

import com.example.designpattern.adapter.FileIO;
import com.example.designpattern.adapter.FileProperties;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AdapterPattern {
    @Test
    void main(){
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/test/file.txt");
            f.setValue("width","1024");
            f.setValue("height","512");
            f.setValue("depth","32");
            f.writeToFile("newFile.txt");
            System.out.println("newfile.txt is Created");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
