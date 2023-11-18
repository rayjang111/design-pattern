package com.example.designpattern.composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public abstract String getParent();
    public abstract void setParent(Entry entry);
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    @Override
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }

    public String getFullFilePath(){
        return getParent() + "/" + getName();
    }

}
