package com.example.designpattern.builder;

public class MarkDownBuilder implements Builder{
    StringBuilder sb = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        sb.append("# ");
        sb.append(title);
        sb.append("\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append(str);
        sb.append("\n");

    }

    @Override
    public void makeItems(String[] items) {
        for (String item: items){
            sb.append("- ");
            sb.append(item);
            sb.append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("==============");
        sb.append("\n\n");
    }

    public String result(){
        return sb.toString();
    }
}
