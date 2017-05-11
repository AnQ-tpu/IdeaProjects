package com.company;

public class Hand {
    public static final int HANDVALUE_GU = 0;
    public static final int HANDVALUE_CHOKI = 1;
    public static final int HANDVALUE_PA = 2;
    public static final String[] HANDSTRING = {"グー", "チョキ", "パー"};
    private static final Hand[] hands = {new Hand(HANDVALUE_GU), new Hand(HANDVALUE_CHOKI), new Hand(HANDVALUE_PA)};
    public static final int RESULT_WIN_LOSE = -1;
    public static final int RESULT_LOSE_WIN = 1;
    public static final int RESULT_EVEN = 0;

    private int handValue;

    private Hand(int handValue){
        this.handValue = handValue;
    }
    public static final Hand getHand(int handValue){
        return hands[handValue];
    }

    //勝ち負け判定
    public static final int compare(Hand myHand, Hand rHand){
        int result = myHand.handValue - rHand.handValue;
        switch(myHand.handValue - rHand.handValue){
            case -1:
            case 2:
                return RESULT_WIN_LOSE;
            case 1:
            case -2:
                return RESULT_LOSE_WIN;
            default:
                return RESULT_EVEN;
        }
    }
    public String toString(){
        return HANDSTRING[handValue];
    }
}
