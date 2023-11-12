package com.example.designpattern.bridge;

import java.util.Random;

public class RandomDisplay extends Display{
    private Random random;
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
        this.random = new Random();
    }
    public void randomDisplay(int times){
        int randomInRange = random.nextInt(times);
        for (int i =0; i < randomInRange; i++){
            display();
        }
    }
}
