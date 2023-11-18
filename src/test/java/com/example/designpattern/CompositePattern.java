package com.example.designpattern;

import com.example.designpattern.composite.Directory;
import com.example.designpattern.composite.File;
import org.junit.jupiter.api.Test;

public class CompositePattern {
    @Test
    void main(){
        System.out.println("Making root Entries");
        Directory rootdir = new Directory("root");
        Directory binddir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(binddir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        binddir.add(new File("vi",10000));
        binddir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();

        System.out.println("Making user entries...");
        Directory youngjin = new Directory("youngjin");
        Directory gildong = new Directory("gildong");

        Directory dojun = new Directory("dojun");
        usrdir.add(youngjin);
        usrdir.add(gildong);
        usrdir.add(dojun);
        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));
        gildong.add(new File("memo.tex", 300));
        dojun.add(new File("game.doc", 400));
        dojun.add(new File("junk.mail",500));
        rootdir.printList();
    }

    @Test
    void exp_02(){
        //given
        Directory rootdir = new Directory("root");
        Directory usrdir = new Directory("usr");
        Directory youngjin = new Directory("youngjin");
        File javaFile = new File("Composite.java", 200);
        //then
        rootdir.add(usrdir);
        usrdir.add(youngjin);
        youngjin.add(javaFile);
        //test
        String testString = "/root/usr/youngjin/Composite.java";
        assert  testString.equals(javaFile.getFullFilePath());
    }
}
