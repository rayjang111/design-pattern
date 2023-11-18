package com.example.designpattern.composite;

public class File extends Entry {
    private String name;
    private int size;
    private String parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
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
        System.out.println(prefix + "/" + this);
    }
}
