package com.example.designpattern;

import com.example.designpattern.proxy.Printable;
import com.example.designpattern.proxy.PrinterProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class ProxyPattern {
    @Test
    void main() {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 "+ p.getPrinterName()+ "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 "+ p.getPrinterName()+ "입니다.");
        p.print("Hello, World.");
    }
}
