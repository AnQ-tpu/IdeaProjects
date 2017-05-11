package com.company;

public class Main {
    public static void main(String[] args) {
        //安久を生成
        Player player1 = new Player("安久", new TurnStrategy());
        //高松を生成
        Player player2 = new Player("高松", new RandomStrategy());

        //100回戦わせる
        for(int i=1; i<=100; i++){
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            switch(Hand.compare(hand1, hand2)){
                case Hand.RESULT_WIN_LOSE:
                    player1.win();
                    player2.lose();
                    System.out.println("Round" + i + "\t" + hand1 + "×" + hand2 + ":" + player1);
                    break;
                case Hand.RESULT_EVEN:
                    player1.even();
                    player2.even();
                    System.out.println("Round" + i + "\t" + hand1 + "×" + hand2 + ":あいこ");
                    break;
                case Hand.RESULT_LOSE_WIN:
                    player1.lose();
                    player2.win();
                    System.out.println("Round" + i + "\t" + hand1 + "×" + hand2 + ":" + player2);
                    break;
            }
        }
    }
}
