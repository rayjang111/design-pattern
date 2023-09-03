package com.example.designpattern.prototype;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char s) {
        this.ulchar = s;
    }

    public UnderlinePen(UnderlinePen prototype){
        this.ulchar = prototype.ulchar;
    }

    @Override
    public void use(String s) {
        int ulLength = s.length();
        System.out.println(s);
        for (int i =0; i<ulLength; i++){
            System.out.print(ulchar);
        }
        System.out.println();
    }
    @Override
    public Product createCopy() {
        return new UnderlinePen(this);
    }


}
