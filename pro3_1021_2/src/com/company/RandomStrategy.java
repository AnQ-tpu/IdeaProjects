package com.company;

import java.util.Random;

public class RandomStrategy implements Strategy{
    Random rnd = new Random();
    public Hand nextHand(){
        int r = rnd.nextInt(3);
        return Hand.getHand(r);
    }
    public void study(boolean win){

    }
}
