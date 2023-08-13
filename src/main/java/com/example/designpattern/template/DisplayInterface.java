package com.example.designpattern.template;

public interface DisplayInterface {
    // 예제의 추상클래스를 인터페이스로 구현
    // java 8 부터는 interface 에서도 default function 을 구현할수 있다
    public void open();
    public void print();
    public void close();
    public default void display(){
        open();
        for (int i=0 ; i<5; i++){
            print();
        }
        close();
    }
}
