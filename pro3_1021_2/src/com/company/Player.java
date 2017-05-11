package com.company;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    //名前とStrategyで初期化
    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    //次の手をStrategyから取得して返す
    public Hand nextHand(){
        return strategy.nextHand();
    }

    //勝利した時の処理
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    //負けた時の処理
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    //引き分けた時の処理
    public void even() {
        gamecount++;
    }

    public String toString(){
        return name + ":" + gamecount + "games" + wincount + "win" + losecount + "lose.";
    }
}
