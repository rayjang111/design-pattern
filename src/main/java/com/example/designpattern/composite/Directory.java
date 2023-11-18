package com.example.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<>();

    private String parent;
    public Directory(String name){
        this.name = name;
        this.parent = "";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory){
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public String getParent() {
        return parent;
    }

    @Override
    public void setParent(Entry entry) {
        this.parent = entry.getParent() + "/" + entry.getName();
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        for (Entry entry: directory){
            entry.printList(prefix+ "/"+ name);
        }
    }

    // 디렉토리 엔트리를 디렉토리에 추가한다
    public Entry add(Entry entry){
        directory.add(entry);
        entry.setParent(this);
        return this;
    }
}
