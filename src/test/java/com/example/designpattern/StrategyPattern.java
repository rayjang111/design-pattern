package com.example.designpattern;

import com.example.designpattern.strategy.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StrategyPattern {
    @Test
    void main(){
        String[] args = {String.valueOf(123), String.valueOf(456)};
        if(args.length != 2){
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("KIM", new WinningStrategy(seed1));
        Player player2 = new Player("Lee", new ProbStrategy(seed2));
        for ( int i=0; i< 10000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if ( nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even ...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1);
        System.out.println(player2);

    }

    @Test
    void exp_one(){
        String[] args = {String.valueOf(123), String.valueOf(456)};
        if(args.length != 2){
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("KIM", new RandomStrategy(seed1));
        Player player2 = new Player("Lee", new ProbStrategy(seed2));
        for ( int i=0; i< 10000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if ( nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even ...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1);
        System.out.println(player2);

    }

    @Test
    void exp_six(){
        List<String> list = Arrays.asList("D","B","C","E","A");
        list.sort(new SmallSort());
        System.out.println(list);
        list.sort(new BigSort());
        System.out.println(list);

    }

    public class SmallSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.compareToIgnoreCase(o2) < 0) {
                return 1;
            }
            else{
                return -1;
            }
        }
    }

    public class BigSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o2.compareToIgnoreCase(o1) <0) {
                return 1;
            }
            else{
                return -1;
            }
        }
    }

}
