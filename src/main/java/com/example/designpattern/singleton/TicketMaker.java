package com.example.designpattern.singleton;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker(){
        System.out.println("singleton ticketMaker created");
    }
    public TicketMaker getTicketMaker(){
        return ticketMaker;
    }
    public synchronized int getNextTicketNumber(){
        return ticket ++;
    }
}
