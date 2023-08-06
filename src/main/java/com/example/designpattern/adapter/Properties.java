package com.example.designpattern.adapter;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Properties {

    private Map<String,String> properties;


    public Properties(){
        this.properties = new HashMap<>();
    }

    public void load(Reader reader) throws IOException{
        String text = "";
        int ch = 0;
        while ( (ch = reader.read()) !=-1){
            text += (char) ch;
        }
        Arrays.stream(text.split("\n")).forEach(x-> {
            String[] list = x.split("=");
            properties.put(list[0], list[1]);
        });
    }


    public String mapToString(){
        String mapString = "";
        for (Map.Entry<String,String> entry : properties.entrySet()){
                mapString += (entry.getKey()+":"+entry.getValue()+"\n");
        }
        return mapString;
    }

    public void store(Writer writer, String comments) throws IOException{
        String buf = comments + mapToString();
        writer.write(buf);
        writer.flush();
    }
}
