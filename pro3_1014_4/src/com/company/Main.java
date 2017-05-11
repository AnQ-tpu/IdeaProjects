package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Score> scoreList = new LinkedList<Score>();
        Random r = new Random();
        for (int i = 1;i <= 50; i++){
            scoreList.add(new Score(i,r.nextInt(100)));
        }

        int max = 0, min = 100;
        Iterator itr = scoreList.iterator();
        while(itr.hasNext()){
            Score s1 = (Score) itr.next();
            if(max < s1.score){
                max = s1.score;
            }
            if(min > s1.score){
                min = s1.score;
            }
            System.out.println(s1.id + ":" + s1.score);
        }
        itr = scoreList.iterator();
        while(itr.hasNext()){
            Score s1 = (Score) itr.next();
            if(s1.score == max){
                System.out.println("max:" + s1.id);
            }else if(s1.score == min){
                System.out.println("min:" + s1.id);
            }
        }
    }
}
