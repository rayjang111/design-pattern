package com.example.designpattern.strategy;

public enum Hand {
    Rock("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int handValue;

    Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    private static Hand[] hands = {
            Rock, SCISSORS, PAPER
    };

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeekerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h){
        if (this == h){
            return 0;
        }
        else if ((this.handValue + 1 )%3 == h.handValue){
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
