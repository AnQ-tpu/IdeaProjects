package com.company;

public class TurnStrategy implements Strategy {
    private int currentHandValue;

    public TurnStrategy(){
        //はじめにグーを出す
        currentHandValue = Hand.HANDVALUE_GU;
    }
    public Hand nextHand(){
        return Hand.getHand(currentHandValue);
    }
    public void study(boolean win){
        if(!win) {
            //負けたら手を変える
            currentHandValue += 2;
            currentHandValue %= 3;
        }
        if(win){
            currentHandValue += 3;
            currentHandValue %= 3;
        }
    }
}
