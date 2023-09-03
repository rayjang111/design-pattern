package com.example.designpattern.prototype;

public interface Product extends Cloneable{
    public abstract void use(String s);
    public  Product createCopy();
}
