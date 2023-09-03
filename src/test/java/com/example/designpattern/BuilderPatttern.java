package com.example.designpattern;

import com.example.designpattern.builder.Director;
import com.example.designpattern.builder.HTMLBuilder;
import com.example.designpattern.builder.MarkDownBuilder;
import com.example.designpattern.builder.TextBuilder;
import org.junit.jupiter.api.Test;

public class BuilderPatttern {

    @Test
    public void textMain(){
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getTextResult();
        System.out.println(result);
    }

    @Test
    public void htmlMain(){
        HTMLBuilder htmlBuilder =new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String filename = htmlBuilder.getHTMLResult();
        System.out.println("HTML파일 "+ filename + "이 작성되었습니다");
    }

    @Test
    public void markDownMain(){
        MarkDownBuilder markDownBuilder =new MarkDownBuilder();
        Director director = new Director(markDownBuilder);
        director.construct();
        String filename = markDownBuilder.result();
        System.out.println("MarkDown파일 "+ filename + "이 작성되었습니다");
    }

    @Test
    public void stringTest(){
        String a ="123";
        String b="123";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String c = new String("123");
        String d = new String("123");
        System.out.println(c==d);
        System.out.println(c.equals(d));

    }
}
