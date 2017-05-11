package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Score> scoreList = new ArrayList<Score>();
        scoreList.add(new Score(5245,78));
        Score s1 = (Score) scoreList.get(0);
        System.out.println(s1.id);
        System.out.println(s1.score);
    }
}
