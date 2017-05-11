package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        int index = 999999;

        List<Score> scoreList1 = new ArrayList<Score>();
        List<Score> scoreList2 = new LinkedList<Score>();
        for (int i = 0;i < 1000000; i++){
            scoreList1.add(new Score(i,78));
        }
        long t1 = System.nanoTime();
        for(int i = 0;i < 1000; i++){
            scoreList1.add(index, new Score(i,78));
            Score s1 = (Score) scoreList1.get(index);
        }
        long t2 = System.nanoTime();
        long t12 = t2-t1;
        for(int i = 0;i < 1000000; i++){
            scoreList2.add(new Score(i,78));
        }
        long t3 = System.nanoTime();
        for(int i = 0;i < 1000; i++){
            scoreList2.add(index, new Score(i,78));
            Score s2 = (Score) scoreList2.get(index);
        }
        long t4 = System.nanoTime();
        long t34 = t4-t3;
        System.out.println("index: " + index);
        System.out.println("Array: " + t12);
        System.out.println("Linked: " + t34);
    }
}
