package com.example.designpattern.singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private String name;
    private static Map<String, Triple> map;

    static {
        map = new HashMap<>();
        String[] names = {"ALPHA", "BETA","GAMMA"};
        Arrays.stream(names).forEach(x -> map.put(x, new Triple(x)));
    }
    private Triple(String name){
        this.name = name;
        System.out.println("created: "+name);
    }
    public String getName(){
        return name;
    }
    static public Triple getInstance(String name)  {
        return map.get(name);
    }
}
