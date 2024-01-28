package com.example.designpattern.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    private String className;

    // 생성자
    public PrinterProxy() {
        this.name = "No Name";
        this.real = null;
        this.className = "com.example.designpattern.proxy.Printer";
    }

    public PrinterProxy(String name) {
        this.name = name;
        this.real = null;
        this.className = "com.example.designpattern.proxy.Printer";
    }

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.real = null;
        this.className = className;
    }

    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    public void print(String string) {
        try {
            realize();
            real.print(string);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void realize() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (real == null) {
            Class<?> finedClass = Class.forName(className);
            Constructor<?> constructor = finedClass.getConstructor(String.class);
            this.real = (Printer) constructor.newInstance(name);
        }
    }
}
