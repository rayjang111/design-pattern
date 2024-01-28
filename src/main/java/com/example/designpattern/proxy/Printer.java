package com.example.designpattern.proxy;

public class Printer implements Printable{

    private String name;

    // 생성자
    public Printer(){
        heavyJob("Printer 인스턴스 생성 중");
    }

    public Printer(String name){
        this.name = name;
        heavyJob("Printer 인스턴스("+ name + ") 생성 중");
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i=0; i<5; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            }
            System.out.println(".");
        }
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ====");
        System.out.println(string);
    }
}
